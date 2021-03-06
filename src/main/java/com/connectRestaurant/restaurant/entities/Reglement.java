package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Reglement implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idReglement;
	
	@ManyToOne
	@JoinColumn(name="code_Commande")
	private Commande commande;

	public Reglement() {
		super();
	}

	public Long getIdReglement() {
		return idReglement;
	}

	public void setIdReglement(Long idReglement) {
		this.idReglement = idReglement;
	}
	
	
	
}
