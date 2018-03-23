package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public abstract class Produit implements Serializable {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String nomProduit;
	private float prix;
	private boolean epice;
	private float quantite;
	private String urlImage;
	
	@ManyToOne
	@JoinColumn(name="code_tva")
	private Tva tva;
	
	@ManyToMany
	private Collection<Formule> formules;
	
	@OneToMany(mappedBy="produit")
	private Collection<LigneDeCommande> ligneDeCommandes;
	
	@ManyToMany
	private Collection<Ingredient> ingredients;
	
	public Produit() {
		super();
	}

	

	public Produit(String nomProduit, float prix, boolean epice, float quantite) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.epice = epice;
		this.quantite = quantite;
	}



	public Produit(String nomProduit, float prix, boolean epice, float quantite, String urlImage, Tva tva) {
		super();
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.epice = epice;
		this.quantite = quantite;
		this.urlImage = urlImage;
		this.tva = tva;
	}



	public String getUrlImage() {
		return urlImage;
	}



	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}



	public boolean isEpice() {
		return epice;
	}



	public void setEpice(boolean epice) {
		this.epice = epice;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
	
	
}
