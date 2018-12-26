package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.Config","com.example.model","com.example.listener"})
public class KafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}
}
