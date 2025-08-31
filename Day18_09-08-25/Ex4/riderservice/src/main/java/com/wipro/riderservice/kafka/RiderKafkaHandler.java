package com.wipro.riderservice.kafka;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.wipro.riderservice.dto.RideRequest;
import com.wipro.riderservice.dto.RideStatusUpdate;
import com.wipro.riderservice.entity.Ride;
import com.wipro.riderservice.service.RideService;

@Component
public class RiderKafkaHandler {

    @Autowired
    private KafkaTemplate<String, RideRequest> kafkaTemplate;

    @Autowired
    private RideService rideService;

    public void publishRide(RideRequest request) {
        Ride ride = new Ride();
        BeanUtils.copyProperties(request, ride);
        rideService.saveRide(ride);
        kafkaTemplate.send("R2U", request);
    }

    @KafkaListener(topics = "U2R", groupId = "rider-group")
    public void consumeStatus(RideStatusUpdate update) {
        rideService.updateStatus(update.getRideId(), update.getStatus());
    }
}