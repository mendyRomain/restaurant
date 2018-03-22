package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Dessert")
public class Dessert extends Produit{
	
	private static final String unite = "g";
	
	private String typeDessert;

	public Dessert() {
		super();
	}

	public Dessert(String nomProduit, float prix, boolean epice, float quantite, String typeDessert) {
		super(nomProduit, prix, epice, quantite);
		this.typeDessert = typeDessert;
	}

	public String getTypeDessert() {
		return typeDessert;
	}

	public void setTypeDessert(String typeDessert) {
		this.typeDessert = typeDessert;
	}

	public static String getUnite() {
		return unite;
	}
	
	
	
}
