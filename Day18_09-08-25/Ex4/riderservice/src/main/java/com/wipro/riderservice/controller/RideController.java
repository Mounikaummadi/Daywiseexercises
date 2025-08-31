package com.wipro.riderservice.controller;


import com.wipro.riderservice.dto.RideRequest;
import com.wipro.riderservice.kafka.RiderKafkaHandler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ride")
public class RideController {

    @Autowired
    private RiderKafkaHandler kafkaHandler;

    @PostMapping
    public ResponseEntity<String> bookRide(@RequestBody RideRequest request) {
        kafkaHandler.publishRide(request);
        return ResponseEntity.ok("Ride requested");
    }
}