package com.wipro.kafkaproducer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.wipro.kafkaproducer.service.MessageService;



@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private final String topicName = "learn-subject";

    @Override
    public void sendMessage(String message) {
        kafkaTemplate.send(topicName, message);
    }
}
