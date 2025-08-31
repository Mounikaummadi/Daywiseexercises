package com.wipro.foodms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.foodms.entity.Food;
import com.wipro.foodms.service.FoodService;

@RestController
@RequestMapping("/foodList")
@CrossOrigin(origins = "http://localhost:4200")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping
    public List<Food> findAll() {
        return foodService.findAll();
    }

    @GetMapping("/{id}")
    public Food findById(@PathVariable int id) {
        return foodService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        foodService.deleteById(id);
    }

    @PostMapping
    public void save(@RequestBody Food food) {
        foodService.save(food);
    }

    @PutMapping
    public void update(@RequestBody Food food) {
        foodService.save(food);
    }
}
