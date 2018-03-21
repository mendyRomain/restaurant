package com.connectRestaurant.restaurant.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.connectRestaurant.restaurant.dao.ProduitRepository;
import com.connectRestaurant.restaurant.entities.Produit;

public class ProduitMetierImplement implements ProduitMetier{
	
	@Autowired
	ProduitRepository produitRepository;
	
	@Override
	public Produit save(Produit p) {
		// TODO Auto-generated method stub
		return produitRepository.save(p);
	}

	@Override
	public List<Produit> getListProduit() {
		// TODO Auto-generated method stub
		return produitRepository.findAll();
	}

}
