package com.wipro.springbootdemo.repo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wipro.springbootdemo.service.CityService;


@Controller
@RequestMapping("/city")
public class CityController {
	
	@Autowired
	CityService cityService;
	
	@GetMapping("/list")
	String getAllCities(Model m)
	{
		
		m.addAttribute("citylist", cityService.getAllCities());
		return "citylist";
	}

}