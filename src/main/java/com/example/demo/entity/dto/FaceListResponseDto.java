package com.example.demo.entity.dto;

import java.math.BigDecimal;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FaceListResponseDto {

	private String faceImage;

	private Integer faceAge;

	private BigDecimal faceSmile;

}
