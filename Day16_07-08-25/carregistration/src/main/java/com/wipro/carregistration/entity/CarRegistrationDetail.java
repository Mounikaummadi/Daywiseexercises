package com.wipro.carregistration.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarRegistrationDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String registrationNumber;
    private LocalDate registrationDate;
    @PrePersist
    public void setRegistrationDate() {
        this.registrationDate = LocalDate.now();

    }
}