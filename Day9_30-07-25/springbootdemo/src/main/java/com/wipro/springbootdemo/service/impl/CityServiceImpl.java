package com.wipro.springbootdemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.springbootdemo.repo.CityRepository;
import com.wipro.springbootdemo.service.CityService;


@Service
public class CityServiceImpl implements CityService {

	@Autowired
	CityRepository cityRepo;
	
	@Override
	public List<String> getAllCities() {
		// TODO Auto-generated method stub
		return cityRepo.getAllCities();
	}
	
	

}