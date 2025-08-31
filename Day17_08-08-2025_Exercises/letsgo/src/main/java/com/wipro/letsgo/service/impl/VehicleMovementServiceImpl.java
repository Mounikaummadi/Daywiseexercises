package com.wipro.letsgo.service.impl;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.repository.VehicleMovementRepository;
import com.wipro.letsgo.service.VehicleMovementService;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VehicleMovementServiceImpl implements VehicleMovementService {

    private final VehicleMovementRepository movementRepository;

    @Override
    public void saveMovement(VehicleMovement movement) {
        movementRepository.save(movement);
    }

    @Override
    public List<VehicleMovement> getAllMovements() {
        return movementRepository.findAll();
    }
}
