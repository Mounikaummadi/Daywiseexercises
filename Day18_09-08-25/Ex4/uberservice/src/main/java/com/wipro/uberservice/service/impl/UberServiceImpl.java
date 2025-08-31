package com.wipro.uberservice.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.riderservice.dto.RideRequest;
import com.wipro.uberservice.entity.UberRide;
import com.wipro.uberservice.repo.UberRideRepository;
import com.wipro.uberservice.service.UberService;

@Service
public class UberServiceImpl implements UberService {

    @Autowired
    private UberRideRepository uberRepo;

    @Override
    public UberRide processRide(RideRequest request) {
        UberRide ride = new UberRide();
        BeanUtils.copyProperties(request, ride);
        ride.setStatus("ASSIGNED");
        ride.setDriverId("DR123");
        ride.setEta("5 mins");
        return uberRepo.save(ride);
    }
}