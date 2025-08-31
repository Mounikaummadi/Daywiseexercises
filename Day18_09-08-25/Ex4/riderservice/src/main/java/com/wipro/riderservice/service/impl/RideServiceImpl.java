package com.wipro.riderservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.riderservice.entity.Ride;
import com.wipro.riderservice.repo.RideRepository;
import com.wipro.riderservice.service.RideService;

@Service
public class RideServiceImpl implements RideService {

    @Autowired
    private RideRepository rideRepo;

    @Override
    public void saveRide(Ride ride) {
        ride.setStatus("REQUESTED");
        rideRepo.save(ride);
    }

    @Override
    public void updateStatus(String rideId, String status) {
        Ride ride = rideRepo.findById(rideId).orElseThrow();
        ride.setStatus(status);
        rideRepo.save(ride);
    }
}