package com.example.demo.service;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.example.demo.properties.FaceApiProperties;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FaceService extends BaseService {

	private static final String SEPARATOR_BASE64 = "64,";

	private static final String FACE_ATTRIBUTES = "age,gender,headPose,smile,facialHair,glasses,emotion,hair,makeup,occlusion,accessories,blur,exposure,noise";

	private final FaceApiProperties faceApiProperties;

	//	private final FaceMapper faceMapper;

	public String insertFace(String image) throws ClientProtocolException, URISyntaxException, IOException {

		return callFaceApi(image);

		//		insertFace(face, image);

	}

	private String callFaceApi(String image) throws URISyntaxException, ClientProtocolException, IOException {

		String subscriptionKey = faceApiProperties.getSubscriptionKey();
		String uriBase = faceApiProperties.getEndpoint();

		byte[] decodedFaceImage = Base64.getDecoder().decode(StringUtils.substringAfter(image, SEPARATOR_BASE64));

		HttpClient httpclient = HttpClientBuilder.create().build();

		String result = "";

		URIBuilder builder = new URIBuilder(uriBase);

		builder.setParameter("returnFaceId", "true");
		builder.setParameter("returnFaceLandmarks", "true");
		builder.setParameter("returnFaceAttributes", FACE_ATTRIBUTES);

		URI uri = builder.build();
		HttpPost request = new HttpPost(uri);

		// Request Header.
		request.setHeader("Content-Type", "application/octet-stream");
		request.setHeader("Ocp-Apim-Subscription-Key", subscriptionKey);

		// Request body.
		ByteArrayEntity testEntity = new ByteArrayEntity(decodedFaceImage);
		request.setEntity(testEntity);

		// Execute the REST API call and get the response entity.
		HttpResponse response = httpclient.execute(request);
		HttpEntity entity = response.getEntity();

		if (entity != null) {
			System.out.println("REST Response:\n");
			String jsonString = EntityUtils.toString(entity).trim();
			if (jsonString.charAt(0) == '[') {
				JSONArray jsonArray = new JSONArray(jsonString);

				JSONObject jsonObject = new JSONObject(jsonArray.get(0).toString());
				result = jsonObject.toString(2);

			} else if (jsonString.charAt(0) == '{') {
				JSONObject jsonObject = new JSONObject(jsonString);

				result = jsonObject.toString(2);

			} else {
				System.out.println(jsonString);
			}

		}

		System.out.println("result:" + result);

		return result;

	}

	//	private void insertFace(Face face, String image) {
	//		byte[] decodedBytes = Base64.getDecoder().decode(StringUtils.substringAfter(image, SEPARATOR_BASE64));
	//		face.setFaceImage(decodedBytes);
	//
	//		face.setEnterDate(new Date());
	//
	//		faceMapper.insert(face);
	//
	//	}
	//
	//	public List<FaceListResponseDto> getFaces() {
	//		String orderByClause = "FACE_SMILE DESC, FACE_HAPPINESS DESC";
	//
	//		FaceExample faceExample = new FaceExample();
	//		faceExample.setOrderByClause(orderByClause);
	//
	//		List<Face> faces = faceMapper.selectByExample(faceExample);
	//
	//		return createFaceListResponceDto(faces);
	//
	//	}
	//
	//	private List<FaceListResponseDto> createFaceListResponceDto(List<Face> faces) {
	//		return faces.stream().map(face -> {
	//			FaceListResponseDto faceListResponseDto = new FaceListResponseDto();
	//			faceListResponseDto.setFaceImage(Base64.getEncoder().encodeToString(face.getFaceImage()));
	//			faceListResponseDto.setFaceAge(face.getFaceAge());
	//			faceListResponseDto.setFaceSmile(face.getFaceSmile());
	//			return faceListResponseDto;
	//
	//		}).collect(Collectors.toList());
	//	}

}
