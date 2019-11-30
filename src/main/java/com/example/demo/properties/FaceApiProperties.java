package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "face.api")
public class FaceApiProperties {

	private String subscriptionKey;

	private String endpoint;

}
