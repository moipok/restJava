package com.example.RESTful.repo;

import com.example.RESTful.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepo extends JpaRepository<Dish, Long> {
}