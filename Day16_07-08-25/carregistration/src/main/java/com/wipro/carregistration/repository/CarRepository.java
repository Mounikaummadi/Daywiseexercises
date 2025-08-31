package com.wipro.carregistration.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.carregistration.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {}