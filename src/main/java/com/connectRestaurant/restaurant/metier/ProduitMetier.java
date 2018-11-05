package com.connectRestaurant.restaurant.metier;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.connectRestaurant.restaurant.entities.Produit;

public interface ProduitMetier {
	public Produit save(Produit p);
	public List<Produit> getListProduit();
	
	
}
