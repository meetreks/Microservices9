package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.demo.controller"})
public class HystrixClientServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixClientServiceApplication.class, args);
	}
}
