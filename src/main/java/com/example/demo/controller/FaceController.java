package com.example.demo.controller;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.client.ClientProtocolException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.FaceCreateRequestDto;
import com.example.demo.service.FaceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class FaceController {

	private final FaceService faceService;

	@PostMapping("/face")
	public String postFace(@Validated FaceCreateRequestDto faceCreateRequestDto)
			throws ClientProtocolException, URISyntaxException, IOException {

		return faceService.insertFace(faceCreateRequestDto.getFaceImage());

	}

	//	@GetMapping("/face")
	//	public String getFace() {
	//
	//		return faceService.getFaces();
	//
	//	}
}
