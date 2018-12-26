package com.example.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.model.Users;
@Service
public class KafkaConsumer {
	@KafkaListener(topics="HelloKafkas", groupId="group_id")
	public void consume(String message) {
		
		System.out.println("Consumed message: "+message);
	}

	@KafkaListener(topics="HelloKafkas_json", groupId="group_json",
			containerFactory="userKafkaListenerFactory")
	public void consumeJson(Users user) {
		System.out.println("Consumed Json Message:"+ user);
	}
}
