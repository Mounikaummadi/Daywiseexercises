package com.wipro.uberservice.service;

import com.wipro.riderservice.dto.RideRequest;
import com.wipro.uberservice.entity.UberRide;

public interface UberService {
    UberRide processRide(RideRequest request);
}