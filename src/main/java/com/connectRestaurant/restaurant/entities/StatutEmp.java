package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StatutEmp implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStatutEmp;
	private boolean salle;
	private boolean caisse;
	private boolean cuisine;
	private boolean empSalle;
	private boolean backOffice;
	private String nomStatut;
	
	public String getNomStatut() {
		return nomStatut;
	}

	public void setNomStatut(String nomStatut) {
		this.nomStatut = nomStatut;
	}

	public boolean isBackOffice() {
		return backOffice;
	}

	public void setBackOffice(boolean backOffice) {
		this.backOffice = backOffice;
	}

	@OneToMany(mappedBy="statutEmp")
	static Collection<Employe>employes;
	
	public StatutEmp() {
		super();
	}

	public StatutEmp(boolean salle, boolean caisse, boolean cuisine) {
		super();
		this.salle = salle;
		this.caisse = caisse;
		this.cuisine = cuisine;  
	}

	public Long getIdStatutEmp() {
		return idStatutEmp;
	}

	public void setIdStatutEmp(Long idStatutEmp) {
		this.idStatutEmp = idStatutEmp;
	}

	public boolean isSalle() {
		return salle;
	}

	public boolean isEmpSalle() {
		return empSalle;
	}

	public void setEmpSalle(boolean empSalle) {
		this.empSalle = empSalle;
	}

	public void setSalle(boolean salle) {
		this.salle = salle;
	}

	public boolean isCaisse() {
		return caisse;
	}

	public void setCaisse(boolean caisse) {
		this.caisse = caisse;
	}

	public boolean isCuisine() {
		return cuisine;
	}

	public void setCuisine(boolean cuisine) {
		this.cuisine = cuisine;
	}
	
	

}
