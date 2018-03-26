package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.Ingredient;

public interface IngredientRepository extends JpaRepository<Ingredient, Long>{

}
