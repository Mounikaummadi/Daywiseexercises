package com.wipro.letsgo.controller;

import com.wipro.letsgo.entity.VehicleMovement;
import com.wipro.letsgo.service.VehicleMovementService;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/move")
@RequiredArgsConstructor
public class MovementController {

    private final VehicleMovementService movementService;

    @PostMapping
    public String moveVehicle(@RequestBody VehicleMovement movement) {
        movementService.saveMovement(movement);
        return "Movement saved successfully!";
    }
    @GetMapping
    public List<VehicleMovement> getAllMovements() {
        return movementService.getAllMovements();
    }

    
}