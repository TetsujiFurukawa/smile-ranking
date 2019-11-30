package com.example.demo.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.dto.FaceCreateRequestDto;
import com.example.demo.entity.dto.FaceListResponseDto;
import com.example.demo.service.FaceService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class FaceController {

	private final FaceService faceService;

	@PostMapping("/face")
	public void postFace(@RequestBody @Validated FaceCreateRequestDto faceCreateRequestDto) {

		faceService.insertFace(faceCreateRequestDto.getFaceImage());

	}

	@GetMapping("/face")
	public List<FaceListResponseDto> getFace() {

		return faceService.getFaces();

	}
}
