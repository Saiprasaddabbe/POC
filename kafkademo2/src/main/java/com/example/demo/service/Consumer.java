package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics = "third_topic",groupId = "third_group")
	public void listenToTopic(String message) {
		System.out.println("The message recieved is "+message);
	}
	@KafkaListener(topics = "fourth_topic",groupId = "fourth_group")
	public void listenToTopic1(String message) {
		System.out.println("The message recieved is "+message);
	}

}
