package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.StatutCommande;

public interface StatutCommandeRepository extends JpaRepository<StatutCommande, Long>{

}
