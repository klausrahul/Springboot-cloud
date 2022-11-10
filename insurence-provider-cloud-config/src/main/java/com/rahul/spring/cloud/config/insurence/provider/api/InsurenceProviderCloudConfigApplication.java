package com.rahul.spring.cloud.config.insurence.provider.api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/insurence-service")
public class InsurenceProviderCloudConfigApplication {

	@GetMapping("/getUpdatePlan")
	public List<String> getPlans(){
		return Stream.of("Silver","Gold","Platinum").collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		SpringApplication.run(InsurenceProviderCloudConfigApplication.class, args);
	}

}
