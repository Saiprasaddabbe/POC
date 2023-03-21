package com.neosoft.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

	
	@KafkaListener(topics="codeDecode_Topic",groupId = "codeDecode_Group")
	public void listenToTopic(String recievedMessage) {
		System.out.println("The message recieved is "+ recievedMessage);
	}
//	@KafkaListener(topics="myTopic",groupId = "mygroup")
//	public void listenToTopic1(String recievedMessage) {
//		System.out.println("The message recieved is "+ recievedMessage);
//	}
	
	
	
}
