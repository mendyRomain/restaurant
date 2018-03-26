package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.Reglement;

public interface ReglementRepository extends JpaRepository<Reglement, Long>{

}
