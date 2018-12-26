package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Users;

@RestController
@RequestMapping("kafka")
public class KafkaController {
	
	@Autowired
	private KafkaTemplate<String,Users> kt;
	private static final String Topic = "Kafka_producer";
	
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name)
	{
		kt.send(Topic, new Users(name,"Technology"));
		return "Sairam published sucessfully";
	}
	
}
