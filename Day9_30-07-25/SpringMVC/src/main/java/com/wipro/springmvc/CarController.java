package com.wipro.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.wipro.springmvc.services.CarService;

public class CarController {
	@Autowired
	CarService carService;
	
	@GetMapping("/car")
	String showCarsList(Model model)
	{ 
		model.addAttribute("carsList", carService.getCarsList());
		return "carsList";
		
	}
	@GetMapping("/list")
	String showCars(Model model)
	{
		return "carsList";
		
	}

}
