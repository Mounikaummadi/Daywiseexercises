package com.wipro.carregistration.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.carregistration.dto.CarDTO;
import com.wipro.carregistration.entity.Car;
import com.wipro.carregistration.entity.CarRegistrationDetail;
import com.wipro.carregistration.repository.CarRepository;
import com.wipro.carregistration.service.CarService;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public Car createCar(CarDTO carDTO) {
        CarRegistrationDetail regDetail = CarRegistrationDetail.builder()
                .registrationNumber(carDTO.getRegistrationNumber())
                .registrationDate(carDTO.getRegistrationDate())
                .build();

        Car car = Car.builder()
                .make(carDTO.getMake())
                .registrationDetail(regDetail)
                .build();

        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findById(id).orElse(null);
    }

    @Override
    public Car updateCar(Long id, CarDTO carDTO) {
        return carRepository.findById(id).map(car -> {
            car.setMake(carDTO.getMake());
            car.getRegistrationDetail().setRegistrationNumber(carDTO.getRegistrationNumber());
            car.getRegistrationDetail().setRegistrationDate(carDTO.getRegistrationDate());
            return carRepository.save(car);
        }).orElse(null);
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.deleteById(id);
    }
}