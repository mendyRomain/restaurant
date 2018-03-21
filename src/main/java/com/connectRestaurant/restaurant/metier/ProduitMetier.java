package com.connectRestaurant.restaurant.metier;

import java.util.List;

import com.connectRestaurant.restaurant.entities.Produit;

public interface ProduitMetier {
	public Produit save(Produit p);
	public List<Produit> getListProduit();
}
