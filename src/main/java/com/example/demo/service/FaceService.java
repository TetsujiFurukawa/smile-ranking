package com.example.demo.service;

import java.net.URI;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.demo.entity.domain.Face;
import com.example.demo.entity.domain.FaceExample;
import com.example.demo.entity.dto.FaceListResponseDto;
import com.example.demo.properties.FaceApiProperties;
import com.example.demo.repository.FaceMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FaceService extends BaseService {

	private static final String SEPARATOR_BASE64 = "64,";

	private static final String FACE_ATTRIBUTES = "age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise";

	private static final String FACE_URI = "https://<My Endpoint String>.com/face/v1.0/detect";

	private static final String imageWithFaces = "{\"url\":\"https://upload.wikimedia.org/wikipedia/commons/c/c3/RH_Louise_Lillian_Gish.jpg\"}";

	private final FaceApiProperties faceApiProperties;

	private final FaceMapper faceMapper;

	public void insertFace(String image) {

		Face face = callFaceApi(image);

		insertFace(face, image);

	}

	private Face callFaceApi(String image) {

		String subscriptionKey = faceApiProperties.getSubscriptionKey();

		String uriBase = FACE_URI.replace("<My Endpoint String>", faceApiProperties.getEndpoint());

		HttpClient httpclient = HttpClientBuilder.create().build();

		try {
			URIBuilder builder = new URIBuilder(uriBase);

			// Request parameters. All of them are optional.
			builder.setParameter("returnFaceId", "true");
			builder.setParameter("returnFaceLandmarks", "false");
			builder.setParameter("returnFaceAttributes", FACE_ATTRIBUTES);

			// Prepare the URI for the REST API call.
			URI uri = builder.build();
			HttpPost request = new HttpPost(uri);

			// Request headers.
			request.setHeader("Content-Type", "application/json");
			request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);

			// Request body.
			StringEntity reqEntity = new StringEntity(imageWithFaces);
			request.setEntity(reqEntity);

			// Execute the REST API call and get the response entity.
			HttpResponse response = httpclient.execute(request);
			HttpEntity entity = response.getEntity();
			if (entity != null) {
				// Format and display the JSON response.
				System.out.println("REST Response:\n");

				String jsonString = EntityUtils.toString(entity).trim();
				if (jsonString.charAt(0) == '[') {
					JSONArray jsonArray = new JSONArray(jsonString);
					System.out.println(jsonArray.toString(2));
				} else if (jsonString.charAt(0) == '{') {
					JSONObject jsonObject = new JSONObject(jsonString);
					System.out.println(jsonObject.toString(2));
				} else {
					System.out.println(jsonString);
				}
			}
		} catch (Exception e) {
			// Display error message.
			System.out.println(e.getMessage());
		}

		return null;

	}

	private void insertFace(Face face, String image) {
		byte[] decodedBytes = Base64.getDecoder().decode(StringUtils.substringAfter(image, SEPARATOR_BASE64));
		face.setFaceImage(decodedBytes);

		face.setEnterDate(new Date());

		faceMapper.insert(face);

	}

	public List<FaceListResponseDto> getFaces() {
		String orderByClause = "FACE_SMILE DESC, FACE_HAPPINESS DESC";

		FaceExample faceExample = new FaceExample();
		faceExample.setOrderByClause(orderByClause);

		List<Face> faces = faceMapper.selectByExample(faceExample);

		return createFaceListResponceDto(faces);

	}

	private List<FaceListResponseDto> createFaceListResponceDto(List<Face> faces) {
		return faces.stream().map(face -> {
			FaceListResponseDto faceListResponseDto = new FaceListResponseDto();
			faceListResponseDto.setFaceImage(Base64.getEncoder().encodeToString(face.getFaceImage()));
			faceListResponseDto.setFaceGender(face.getFaceGender());
			faceListResponseDto.setFaceAge(face.getFaceAge());
			faceListResponseDto.setFaceHappiness(face.getFaceHappiness());
			faceListResponseDto.setFaceSmile(face.getFaceSmile());
			faceListResponseDto.setEnterDate(face.getEnterDate());
			return faceListResponseDto;

		}).collect(Collectors.toList());
	}

}
