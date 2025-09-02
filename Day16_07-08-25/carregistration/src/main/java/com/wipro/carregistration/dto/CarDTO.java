package com.wipro.carregistration.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarDTO {
    private String make;
    private String registrationNumber;
    private LocalDate registrationDate;
}
