package com.wipro.springbootdemo.repo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.springbootdemo.service.CityService;


@Repository
public class CityRepository {
	
	public List<String> getAllCities()
	{
		
		return Arrays.asList("Bangalore","Pune","Hyderabad","vizag");
	}

}
