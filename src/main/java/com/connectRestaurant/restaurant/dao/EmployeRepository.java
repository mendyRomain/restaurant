package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, String>{

}
