package com.rahul.spring.cloud.config.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class InsurenceCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InsurenceCloudConfigServerApplication.class, args);
	}

}
