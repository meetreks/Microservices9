package com.example.controler;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Service {
	@RequestMapping("/")
	public String HelloWorld()
	{
		return "Hello Sai Service1";
	}

}
