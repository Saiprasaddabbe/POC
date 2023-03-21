package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Producer;

@RestController
@RequestMapping("/rest/api/")
public class RestControllerForKafkaMsg {

	@Autowired
	Producer producer;
	
	
	@GetMapping("/producerMsg")
	public void getMessageFromClient(@RequestParam("message") String message) {
		
		
		producer.sendMsgtoTopic(message);
		
		
	}
	@GetMapping("/producerMsg1")
	public void getMessageFromClient1(@RequestParam("message") String message) {
		
		
		producer.sendMsgtoTopic(message);
		
		
	}
	
}
