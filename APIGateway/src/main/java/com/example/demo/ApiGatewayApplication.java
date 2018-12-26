package com.example.demo;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.gateway;
/* 
 * The Following projects are interconnected
 * 1. APIGateway directly runs a service at port = 8090 and sample methods from the POJO classes
 * 2. APIZuul now does the same thing, and just routes everything via the gateway which is the 
 *    name of the spring.application.name in the properties file
 * **/
@RestController
@SpringBootApplication(scanBasePackages = {"com.example.controler"})
public class ApiGatewayApplication {
	
	@RequestMapping(value = "/echoStudentName/{name}")
	public String echoStudentName(@PathVariable(name="name") String name)

	{
		return "hello" + name + new Date();
		
	}
	
	@RequestMapping(value = "/getStudentDetails/{name}")
	public gateway getStudentDetails(@PathVariable(name="name") String name)

	{
		return new gateway(name,"Pune","MCA");
		
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}
}
