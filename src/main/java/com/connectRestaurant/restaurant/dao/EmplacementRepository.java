package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.Emplacement;

public interface EmplacementRepository extends JpaRepository<Emplacement, Long>{

}
