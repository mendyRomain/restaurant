package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.LigneDeCommande;

public interface LigneDeCommandeRepository extends JpaRepository<LigneDeCommande, Long>{

}
