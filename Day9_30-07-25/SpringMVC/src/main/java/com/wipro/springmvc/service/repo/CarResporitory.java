package com.wipro.springmvc.service.repo;

import java.util.Arrays;
import java.util.List;

public class CarResporitory {

	public List<String> getCarsList() {		
		List<String> carsList= Arrays.asList("BMW","Audi","TATA","RR");
		return carsList;
	}


}
