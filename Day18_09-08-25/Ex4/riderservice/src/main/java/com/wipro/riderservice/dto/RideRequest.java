package com.wipro.riderservice.dto;

import lombok.Data;

@Data
public class RideRequest {
    private String rideId;
    private String riderId;
    private String pickup;
    private String drop;
}