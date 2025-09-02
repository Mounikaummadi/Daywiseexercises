package com.wipro.uberservice.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.wipro.riderservice.dto.RideRequest;
import com.wipro.riderservice.dto.RideStatusUpdate;
import com.wipro.uberservice.service.UberService;

@Component
public class UberKafkaHandler {

    @Autowired
    private UberService uberService;

    @Autowired
    private KafkaTemplate<String, RideStatusUpdate> kafkaTemplate;

    @KafkaListener(topics = "R2U", groupId = "uber-group")
    public void consumeRide(RideRequest request) {
        UberRide ride = uberService.processRide(request);
       