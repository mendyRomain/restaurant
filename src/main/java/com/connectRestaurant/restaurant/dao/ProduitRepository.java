package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.connectRestaurant.restaurant.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
