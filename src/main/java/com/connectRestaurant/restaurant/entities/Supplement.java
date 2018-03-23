package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplement implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idSupl;
	private float prix;
	private String typeSupl;
	
	@OneToMany(mappedBy="supplement")
	private Collection<Ingredient> ingredients;
	
	@OneToMany(mappedBy="supplement")
	private Collection<LigneDeCommande> ligneDeCommandes;
	
	public Supplement() {
		super();
	}

	public Supplement(float prix, String typeSupl) {
		super();
		this.prix = prix;
		this.typeSupl = typeSupl;
	}

	public Long getIdSupl() {
		return idSupl;
	}

	public void setIdSupl(Long idSupl) {
		this.idSupl = idSupl;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public String getTypeSupl() {
		return typeSupl;
	}

	public void setTypeSupl(String typeSupl) {
		this.typeSupl = typeSupl;
	}
	
	
	
	
}
