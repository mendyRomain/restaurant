package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Produit implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String nomProduit;
	private float prix;
	
	public Produit() {
		super();
	}

	public Produit(String nomProduit, float prix) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	
	
}
