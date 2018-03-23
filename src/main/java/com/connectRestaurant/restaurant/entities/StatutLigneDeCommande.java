package com.connectRestaurant.restaurant.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class StatutLigneDeCommande {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idStatutLDC;
	private String statutLdc;
	private Date dateLdc;
	
	@OneToMany(mappedBy="statutLigneDeCommande")
	private Collection<LigneDeCommande> ligneDeCommandes;
	
	
	
	
	public Collection<LigneDeCommande> getLigneDeCommandes() {
		return ligneDeCommandes;
	}

	public void setLigneDeCommandes(Collection<LigneDeCommande> ligneDeCommandes) {
		this.ligneDeCommandes = ligneDeCommandes;
	}

	public StatutLigneDeCommande() {
		super();
	}
	
	public StatutLigneDeCommande(String statutLdc, Date dateLdc) {
		super();
		this.statutLdc = statutLdc;
		this.dateLdc = dateLdc;
	}
	public Long getIdStatutLDC() {
		return idStatutLDC;
	}
	public void setIdStatutLDC(Long idStatutLDC) {
		this.idStatutLDC = idStatutLDC;
	}
	public String getStatutLdc() {
		return statutLdc;
	}
	public void setStatutLdc(String statutLdc) {
		this.statutLdc = statutLdc;
	}
	public Date getDateLdc() {
		return dateLdc;
	}
	public void setDateLdc(Date dateLdc) {
		this.dateLdc = dateLdc;
	}
	
	
	
	
}
