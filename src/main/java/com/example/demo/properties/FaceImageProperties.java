package com.example.demo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "face.images")
public class FaceImageProperties {

	private String uploadDirectory;

	private String publicUrl;

	private String defaultExtension;

	private String dataType;

}
