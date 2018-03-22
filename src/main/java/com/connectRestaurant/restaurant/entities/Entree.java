package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Entre")
public class Entree extends Produit{
	
	private static final String unite= "g";
	
	private String typeEntre;

	public Entree() {
		super();
	}

	public Entree(String nomProduit, float prix, boolean epice, float quantite, String typeEntre) {
		super(nomProduit, prix, epice, quantite);
		this.typeEntre = typeEntre;
	}

	public String getTypeEntre() {
		return typeEntre;
	}

	public void setTypeEntre(String typeEntre) {
		this.typeEntre = typeEntre;
	}

	public static String getUnite() {
		return unite;
	}
	
	
	
}
