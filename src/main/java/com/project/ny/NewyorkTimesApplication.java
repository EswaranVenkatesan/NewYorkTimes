package com.project.ny;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewyorkTimesApplication {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NewyorkTimesApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(NewyorkTimesApplication.class, args);
		LOGGER.info("Application Started successfully");
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
