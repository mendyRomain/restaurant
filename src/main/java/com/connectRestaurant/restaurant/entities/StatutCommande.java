package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StatutCommande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStatutCommande;
	private String AvancementCo;
	
	@OneToMany(mappedBy="statutCommande")
	private Collection<Commande>commandes;
	
	public StatutCommande() {
		super();
	}

	public StatutCommande(String avancementCo) {
		super();
		AvancementCo = avancementCo;
	}

	public Long getIdStatutCommande() {
		return idStatutCommande;
	}

	public void setIdStatutCommande(Long idStatutCommande) {
		this.idStatutCommande = idStatutCommande;
	}

	public String getAvancementCo() {
		return AvancementCo;
	}

	public void setAvancementCo(String avancementCo) {
		AvancementCo = avancementCo;
	}
	
	
	
}
