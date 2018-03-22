package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Boisson")
public class Boisson extends Produit{
	
	private static final String unite= "ml";
	
	private boolean alcool;
	private long degre;
	public Boisson() {
		super();
	}
	public Boisson(String nomProduit, float prix, boolean epice, float quantite, boolean alcool, long degre) {
		super(nomProduit, prix, epice, quantite);
		this.alcool = alcool;
		this.degre = degre;
	}
	public boolean isAlcool() {
		return alcool;
	}
	public void setAlcool(boolean alcool) {
		this.alcool = alcool;
	}
	public long getDegre() {
		return degre;
	}
	public void setDegre(long degre) {
		this.degre = degre;
	}
	public static String getUnite() {
		return unite;
	}
	
	
}
