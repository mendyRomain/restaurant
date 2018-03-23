package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idIngredient;
	private String nomIngredient;
	private boolean alrgene;
	
	@ManyToMany(mappedBy="ingredients")
	private Collection<Produit> produits;
	
	@ManyToOne
	@JoinColumn(name="code_supplement")
	private Supplement supplement;
	
	
	public Ingredient() {
		super();
	}

	public Ingredient(String nomIngredient, boolean alrgene) {
		super();
		this.nomIngredient = nomIngredient;
		this.alrgene = alrgene;
	}

	public Long getIdIngredient() {
		return idIngredient;
	}

	public void setIdIngredient(Long idIngredient) {
		this.idIngredient = idIngredient;
	}

	public String getNomIngredient() {
		return nomIngredient;
	}

	public void setNomIngredient(String nomIngredient) {
		this.nomIngredient = nomIngredient;
	}

	public boolean isAlrgene() {
		return alrgene;
	}

	public void setAlrgene(boolean alrgene) {
		this.alrgene = alrgene;
	}
	
	
	
}
