package com.wipro.letsgo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "vehicle_movement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer vehId;
    private Double lat;

    @Column(name = "longitude")
    private Double longitude;

}