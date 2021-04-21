package com.walmart_back_end_dev_test_luis_cam.back_end_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import config.MongoDBConfig;
@Import(MongoDBConfig.class)
@SpringBootApplication
public class BackEndTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackEndTestApplication.class, args);
	}

}
