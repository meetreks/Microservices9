package com.example.demo;
/* Just a SAMPLE Application, do not confuse with anything  **/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.controler","com.example.service","com.examplemodel."})
public class JpaSpringExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSpringExampleApplication.class, args);
	}
}
