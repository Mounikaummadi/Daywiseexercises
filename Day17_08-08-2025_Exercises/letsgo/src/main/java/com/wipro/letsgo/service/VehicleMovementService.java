package com.wipro.letsgo.service;

import java.util.List;

import com.wipro.letsgo.entity.VehicleMovement;
public interface VehicleMovementService {
    void saveMovement(VehicleMovement movement);
    List<VehicleMovement> getAllMovements();
}
