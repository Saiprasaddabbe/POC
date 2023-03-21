package com.neosoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.service.Producer;

@RestController
@RequestMapping("/rest/api")
public class RestControllerForKafkaMsg {

	
	@Autowired
	private Producer producer;
	
	@GetMapping("/producerMsg")
	public void getMessageFormClient(@RequestParam("message") String message) {
		
		producer.sendMsgToTopic(message);
		
		
	}
//	@GetMapping("/{message}")
//	public void getMessageFormClient1(@PathVariable("message") String message) {
//		
//		producer.sendMsgToTopic1(message);
//		
//		
//	}
}
