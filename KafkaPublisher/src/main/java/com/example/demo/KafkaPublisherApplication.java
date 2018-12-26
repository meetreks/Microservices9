package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.controller","com.demo.model","demo.example.configuration"})
public class KafkaPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaPublisherApplication.class, args);
	}
}
