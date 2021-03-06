package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Promotion implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPromotion;
	private String codePromotion;
	private float pourcentageApplicable;
	private String infoProm;
	
	@ManyToMany(mappedBy="promotions")
	private Collection<Commande>commandes;
	
	
	public Promotion() {
		super();
	}

	public Promotion(String codePromotion, float pourcentageApplicable, String infoProm) {
		super();
		this.codePromotion = codePromotion;
		this.pourcentageApplicable = pourcentageApplicable;
		this.infoProm = infoProm;
	}

	public Long getIdPromotion() {
		return idPromotion;
	}

	public void setIdPromotion(Long idPromotion) {
		this.idPromotion = idPromotion;
	}

	public String getCodePromotion() {
		return codePromotion;
	}

	public void setCodePromotion(String codePromotion) {
		this.codePromotion = codePromotion;
	}

	public float getPourcentageApplicable() {
		return pourcentageApplicable;
	}

	public void setPourcentageApplicable(float pourcentageApplicable) {
		this.pourcentageApplicable = pourcentageApplicable;
	}

	public String getInfoProm() {
		return infoProm;
	}

	public void setInfoProm(String infoProm) {
		this.infoProm = infoProm;
	}
	
	
	
}
