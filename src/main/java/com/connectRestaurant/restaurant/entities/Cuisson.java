package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cuisson implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idCuisson;
	private String typeCuisson;
	
	@OneToMany(mappedBy="cuisson")
	private Collection<Plat> plats;

	public Long getIdCuisson() {
		return idCuisson;
	}

	public void setIdCuisson(Long idCuisson) {
		this.idCuisson = idCuisson;
	}

	public Collection<Plat> getPlats() {
		return plats;
	}

	public void setPlats(Collection<Plat> plats) {
		this.plats = plats;
	}

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
