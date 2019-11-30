package com.example.demo.entity.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FaceListResponseDto {

	private String faceImage;

	private String faceGender;

	private BigDecimal faceAge;

	private BigDecimal faceHappiness;

	private Integer faceSmile;

	private Date enterDate;

}
