package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Commande implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numCommande;
	@Temporal(TemporalType.TIMESTAMP)
	private Date DateCommande;
	
	@OneToMany(mappedBy="commande")
	private Collection<LigneDeCommande> ligneDeCommandes;
	
	@ManyToOne
	@JoinColumn(name="code_statutCommande")
	private StatutCommande statutCommande;
	
	@ManyToMany
	private Collection<Employe>employes;
	
	@ManyToMany
	private Collection<Emplacement>emplacements;
	
	@ManyToMany
	private Collection<Promotion>promotions;
	
	@OneToMany(mappedBy="commande")
	private Collection<Reglement>reglements;
	
	public Commande() {
		super();
	}

	public Commande(Long numCommande, Date dateCommande) {
		super();
		this.numCommande = numCommande;
		DateCommande = dateCommande;
	}

	public Long getNumCommande() {
		return numCommande;
	}

	public void setNumCommande(Long numCommande) {
		this.numCommande = numCommande;
	}

	public Date getDateCommande() {
		return DateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		DateCommande = dateCommande;
	}
	
	
	
	
}
