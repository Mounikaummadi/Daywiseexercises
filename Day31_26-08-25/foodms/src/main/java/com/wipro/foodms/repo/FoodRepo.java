package com.wipro.foodms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wipro.foodms.entity.Food;

@Repository
public interface FoodRepo extends JpaRepository<Food, Integer> {
}
