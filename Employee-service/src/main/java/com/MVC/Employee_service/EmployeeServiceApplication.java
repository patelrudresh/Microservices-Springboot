package com.MVC.Employee_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// <<<<<< for-commincating-to-microservices
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
=======
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
// >>>>>>> main

@SpringBootApplication
@EnableFeignClients
public class EmployeeServiceApplication {

// <<<<<< for-commincating-to-microservices
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	
//	 
=======
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
// >>>>>>> main
	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
