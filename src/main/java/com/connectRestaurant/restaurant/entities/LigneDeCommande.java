package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneDeCommande implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idLigneDeCommande;
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name="code_produit")
	private Produit produit;
	
	@ManyToOne
	@JoinColumn(name="code_formule")
	private Formule formules;
	
	@ManyToOne
	@JoinColumn(name="code_supplement")
	private Supplement supplement;
	
	@ManyToOne
	@JoinColumn(name="code_commande")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name="code_statutLigneDeCommande")
	private StatutLigneDeCommande statutLigneDeCommande;
	
	
	public LigneDeCommande() {
		super();
	}

	

	public LigneDeCommande(int quantite) {
		super();
		this.quantite = quantite;
	}



	public Long getIdLigneDeCommande() {
		return idLigneDeCommande;
	}

	public void setIdLigneDeCommande(Long idLigneDeCommande) {
		this.idLigneDeCommande = idLigneDeCommande;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
	
}
