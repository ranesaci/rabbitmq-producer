package com.sachin4java.rabbitmqproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sachin4java.rabbitmqproducer.producer.MessageProducer;

@RestController
@RequestMapping("/producer")
public class ProducerController {
	
	@Autowired
    private MessageProducer messageProducer;

	
	@GetMapping
	public String produce(@RequestParam String message) {
		
		messageProducer.sendMessage(message);
		return "Message Sent to rabbitMQ and message="+message;
	}
	
	

}
