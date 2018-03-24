package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Emplacement implements Serializable{

	@Id
	private Long numEmplacement;	
	private String commentaireTable;
	private int nombreDePlace;
	
	@ManyToMany(mappedBy="emplacements")
	private Collection<Commande>commandes;
	
	public Emplacement() {
		super();
	}

	public Emplacement(Long numEmplacement, String commentaireTable) {
		super();
		this.numEmplacement = numEmplacement;
		this.commentaireTable = commentaireTable;
	}

	public Long getNumEmplacement() {
		return numEmplacement;
	}

	public void setNumEmplacement(Long numEmplacement) {
		this.numEmplacement = numEmplacement;
	}

	public String getCommentaireTable() {
		return commentaireTable;
	}

	public void setCommentaireTable(String commentaireTable) {
		this.commentaireTable = commentaireTable;
	}
	
	
	
}
