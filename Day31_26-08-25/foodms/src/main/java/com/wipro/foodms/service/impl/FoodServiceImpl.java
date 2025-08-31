package com.wipro.foodms.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.foodms.entity.Food;
import com.wipro.foodms.repo.FoodRepo;
import com.wipro.foodms.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodRepo foodRepo;

    @Override
    public List<Food> findAll() {
        return foodRepo.findAll();
    }

    @Override
    public Food findById(int id) {
        Optional<Food> foodOpt = foodRepo.findById(id);
        return foodOpt.orElse(null);
    }

    @Override
    public void save(Food food) {
        foodRepo.save(food);
    }

    @Override
    public void deleteById(int id) {
        foodRepo.deleteById(id);
    }
}
