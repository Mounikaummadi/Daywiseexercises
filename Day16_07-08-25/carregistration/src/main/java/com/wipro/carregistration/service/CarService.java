package com.wipro.carregistration.service;

import java.util.List;

import com.wipro.carregistration.dto.CarDTO;
import com.wipro.carregistration.entity.Car;

public interface CarService {
    Car createCar(CarDTO carDTO);
    List<Car> getAllCars();
    Car getCarById(Long id);
    Car updateCar(Long id, CarDTO carDTO);
    void deleteCar(Long id);
}