package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("Plat")
public class Plat extends Produit{
	private static final String unite="g";
	
	private String typePlat;
	private boolean redMeat;
	
	@ManyToOne
	@JoinColumn(name="Code_Cuisson")
	private Cuisson cuisson;
	
	public Cuisson getCuisson() {
		return cuisson;
	}

	public void setCuisson(Cuisson cuisson) {
		this.cuisson = cuisson;
	}

	public Plat() {
		super();
	}

	public Plat(String nomProduit, float prix, boolean epice, float quantite, String typePlat, boolean redMeat) {
		super(nomProduit, prix, epice, quantite);
		this.typePlat = typePlat;
		this.redMeat = redMeat;
	}

	public String getTypePlat() {
		return typePlat;
	}

	public void setTypePlat(String typePlat) {
		this.typePlat = typePlat;
	}

	public boolean isRedMeat() {
		return redMeat;
	}

	public void setRedMeat(boolean redMeat) {
		this.redMeat = redMeat;
	}

	public static String getUnite() {
		return unite;
	}
	
	
	
}
