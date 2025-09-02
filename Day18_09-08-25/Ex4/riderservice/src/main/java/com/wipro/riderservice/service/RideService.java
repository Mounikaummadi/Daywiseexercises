package com.wipro.riderservice.service;

import com.wipro.riderservice.entity.*;

public interface RideService {
    void saveRide(Ride ride);
    void updateStatus(String rideId, String status);
}