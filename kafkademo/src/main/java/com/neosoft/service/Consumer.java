package com.neosoft.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	@KafkaListener(topics="second_topic",groupId = "second_group")
	public void listenToTopic(String recievedMessage) {
		System.out.println("The message recieved is "+ recievedMessage);
	}

	
	
}
