package com.wipro.riderservice.dto;

import lombok.Data;

@Data
public class RideStatusUpdate {
    private String rideId;
    private String status;
    private String driverId;
    private String eta;
}