package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	
	public void sendMsgtoTopic(String message) {
		
		kafkaTemplate.send("third_topic",message);
	}
	public void sendMsgtoTopic1(String message) {
		
		kafkaTemplate.send("fourth_topic",message);
	}
	
	
}
