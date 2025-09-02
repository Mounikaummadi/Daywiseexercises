package com.wipro.foodms.service;

import java.util.List;
import com.wipro.foodms.entity.Food;

public interface FoodService {
    List<Food> findAll();
    Food findById(int id);
    void save(Food food);
    void deleteById(int id);
}
