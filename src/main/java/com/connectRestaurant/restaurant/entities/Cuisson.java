package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cuisson implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCuisson;
	private String typeCuisson;

	public Cuisson() {
		super();
	}

	public Cuisson(String typeCuisson) {
		super();
		this.typeCuisson = typeCuisson;
	}

	public String getTypeCuisson() {
		return typeCuisson;
	}

	public void setTypeCuisson(String typeCuisson) {
		this.typeCuisson = typeCuisson;
	}
	
	
	
}
