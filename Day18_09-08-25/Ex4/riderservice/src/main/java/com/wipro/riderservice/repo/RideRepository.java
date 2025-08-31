package com.wipro.riderservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.riderservice.entity.Ride;

public interface RideRepository extends JpaRepository<Ride, String> {
}