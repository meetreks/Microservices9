package com.example.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.kafka.support.serializer.JsonSerializer;

import com.example.model.Users;


@EnableKafka
@Configuration
public class Config {
    @Bean
	public ConsumerFactory<String,String> consumerFactory() {
		
		Map<String,Object>config = new HashMap<>();
		
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		
		return new DefaultKafkaConsumerFactory<>(config);
	}
    
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,String> kafkaListenerContainerFactory() {
    	
    	ConcurrentKafkaListenerContainerFactory<String, String> factory = new ConcurrentKafkaListenerContainerFactory<>();
    	factory.setConsumerFactory(consumerFactory());
    	return factory;
    }
    
    @Bean
    public ConsumerFactory<String,Users>userConsumerFactory(){
    	Map<String,Object>config = new HashMap<>();
		
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonSerializer.class);
		return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(),new JsonDeserializer<>(Users.class));
    	
    }
    
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String,Users> userKafkaListenerFactory() {
    	
    	ConcurrentKafkaListenerContainerFactory<String, Users> factory = new ConcurrentKafkaListenerContainerFactory<>();
    	factory.setConsumerFactory(userConsumerFactory());
    	return factory;
    }
	
	
}


