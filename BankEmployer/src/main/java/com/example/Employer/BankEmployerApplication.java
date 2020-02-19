package com.example.Employer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class BankEmployerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankEmployerApplication.class, args);
	}

}
