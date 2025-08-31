package com.wipro.kafkaconsumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "learn-subject", groupId = "learn-group")
    public void consume(String message) {
        System.out.println("Consumed message from learn-subject: " + message);
    }
}