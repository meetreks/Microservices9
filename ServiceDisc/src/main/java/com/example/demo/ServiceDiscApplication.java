package com.example.demo;
/* The Following Projects are inter connected.
 * 1. Service Discovery to Enable Stuff for Eureka
 * 2. Eureka Service to start a simple service and Enable Eureka Client
 * 3. Eureka Service2 to start a simple service anf Enable Eureka Client
 * 4. Ribbon to bind these together and do client side load balancing
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServiceDiscApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscApplication.class, args);
	}
}
