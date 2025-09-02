package com.wipro.springmvc.services.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.wipro.springmvc.service.repo.CarResporitory;
import com.wipro.springmvc.services.CarService;

public class CarServiceImpl implements CarService{
	@Autowired
	CarResporitory carRepo;
	
	@Override
	public List<String> getCarsList() {
		 
		return carRepo.getCarsList();
	}

}
