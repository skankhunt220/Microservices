package com.skankhunt220;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FirstMicroserviceApp {
	public static void main(String[] args) {
		SpringApplication.run(FirstMicroserviceApp.class, args);
	}
}