package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long>{

}
