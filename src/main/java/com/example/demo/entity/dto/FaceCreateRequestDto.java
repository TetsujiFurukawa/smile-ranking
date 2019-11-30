package com.example.demo.entity.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FaceCreateRequestDto {

	@NotNull
	@NotBlank
	@Size(max = 1000000000)
	private String faceImage;

}
