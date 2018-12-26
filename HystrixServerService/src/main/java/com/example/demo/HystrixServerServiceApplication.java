package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication(scanBasePackages = {"com.demo.controller", "com.demo.delegate"})
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HystrixServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixServerServiceApplication.class, args);
	}
}
