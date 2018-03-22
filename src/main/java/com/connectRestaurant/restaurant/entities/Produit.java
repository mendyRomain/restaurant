package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PRODUIT", discriminatorType=DiscriminatorType.STRING, length=8)
public abstract class Produit implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String nomProduit;
	private float prix;
	private boolean epice;
	private float quantite;
	
	
	public Produit() {
		super();
	}

	

	public Produit(String nomProduit, float prix, boolean epice, float quantite) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.epice = epice;
		this.quantite = quantite;
	}



	public boolean isEpice() {
		return epice;
	}



	public void setEpice(boolean epice) {
		this.epice = epice;
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
