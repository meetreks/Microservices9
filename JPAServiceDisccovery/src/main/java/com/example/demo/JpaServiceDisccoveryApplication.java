package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEurekhaServer
@SpringBootApplication
public class JpaServiceDisccoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaServiceDisccoveryApplication.class, args);
	}
}
