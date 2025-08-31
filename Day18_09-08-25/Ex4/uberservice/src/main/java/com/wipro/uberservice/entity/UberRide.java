package com.wipro.uberservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UberRide {
    @Id
    private String rideId;
    private String riderId;
    private String pickup;
    private String drop;
    private String status;
    private String driverId;
    private String eta;
}