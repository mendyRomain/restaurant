package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Tva implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTva;
	private String typeTVA;
	private float pourcentageTVA;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTVA;
	
	@OneToMany(mappedBy="tva")
	private Collection<Produit> produits;
	
	@OneToMany(mappedBy="tva")
	private Collection<Formule> formules;
	
	public Tva() {
		super();
	}

	

	public Collection<Produit> getProduits() {
		return produits;
	}



	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}



	public Date getDateTVA() {
		return dateTVA;
	}



	public void setDateTVA(Date dateTVA) {
		this.dateTVA = dateTVA;
	}



	public Tva(String typeTVA, float pourcentageTVA, Date dateTVA) {
		super();
		this.typeTVA = typeTVA;
		this.pourcentageTVA = pourcentageTVA;
		this.dateTVA = dateTVA;
	}



	public Long getIdTva() {
		return idTva;
	}

	public void setIdTva(Long idTva) {
		this.idTva = idTva;
	}

	public String getTypeTVA() {
		return typeTVA;
	}

	public void setTypeTVA(String typeTVA) {
		this.typeTVA = typeTVA;
	}

	public float getPourcentageTVA() {
		return pourcentageTVA;
	}

	public void setPourcentageTVA(float pourcentageTVA) {
		this.pourcentageTVA = pourcentageTVA;
	}
	
	
	
	
	
}
