package com.wipro.kafkaproducer.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.kafkaproducer.service.MessageService;

@RestController
@RequestMapping("/publish")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public String publishMessage(@RequestParam String message) {
        messageService.sendMessage(message);
        return "Message sent to Kafka topic: " + message;
    }
}
