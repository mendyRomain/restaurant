package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formule implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idFormule;
	private String nomFormule;
	private String typeFormule;
	
	public Formule() {
		super();
	}

	public Formule(String nomFormule, String typeFormule) {
		super();
		this.nomFormule = nomFormule;
		this.typeFormule = typeFormule;
	}

	public Long getIdFormule() {
		return idFormule;
	}

	public void setIdFormule(Long idFormule) {
		this.idFormule = idFormule;
	}

	public String getNomFormule() {
		return nomFormule;
	}

	public void setNomFormule(String nomFormule) {
		this.nomFormule = nomFormule;
	}

	public String getTypeFormule() {
		return typeFormule;
	}

	public void setTypeFormule(String typeFormule) {
		this.typeFormule = typeFormule;
	}
	
	
	
	
}
