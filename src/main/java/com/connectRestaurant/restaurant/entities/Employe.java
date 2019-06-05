package com.connectRestaurant.restaurant.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Employe implements Serializable{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(unique=true, nullable=false)
	private String idEmploye;
	
	@Column(nullable=false)
	private String nomEmploye;
	
	@Column(nullable=false)
	private String prenomEmploye;
	
	@Column(nullable=false)
	private Date dateNaissance;
	
	@Column(nullable=false)
	private Date dateEntre;
	
	
	private Date dateSortie;
	
	@Column(nullable=false)
	private String numSecu;
	
	@Column(nullable=false)
	private String mdp;
	
	
	private boolean suppr;
	
	@ManyToMany(mappedBy="employes")
	private Collection<Commande> commandes;
	
	@OneToMany
	private Collection<Connection> connections;
	
	@ManyToOne
	@JoinColumn(name="code_statutEmp")
	private StatutEmp statutEmp;
	
	
	
	public Employe() {
		super();
	}

	public Employe(String nomEmploye, String prenomEmploye, Date dateNaissance, Date dateEntre, Date dateSortie,
			String numSecu) {
		super();
		this.nomEmploye = nomEmploye;
		this.prenomEmploye = prenomEmploye;
		this.dateNaissance = dateNaissance;
		this.dateEntre = dateEntre;
		this.dateSortie = dateSortie;
		this.numSecu = numSecu;
	}
	
	
	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getIdEmploye() {
		return idEmploye;
	}

	public void setIdEmploye(String idEmploye) {
		this.idEmploye = idEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public String getPrenomEmploye() {
		return prenomEmploye;
	}

	public void setPrenomEmploye(String prenomEmploye) {
		this.prenomEmploye = prenomEmploye;
	}

	public Collection<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<Commande> commandes) {
		this.commandes = commandes;
	}

	public Collection<Connection> getConnections() {
		return connections;
	}

	public void setConnections(Collection<Connection> connections) {
		this.connections = connections;
	}

	public StatutEmp getStatutEmp() {
		return statutEmp;
	}

	public void setStatutEmp(StatutEmp statutEmp) {
		this.statutEmp = statutEmp;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Date getDateEntre() {
		return dateEntre;
	}

	public void setDateEntre(Date dateEntre) {
		this.dateEntre = dateEntre;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public String getNumSecu() {
		return numSecu;
	}

	public void setNumSecu(String numSecu) {
		this.numSecu = numSecu;
	}

	public boolean isSuppr() {
		return suppr;
	}

	public void setSuppr(boolean suppr) {
		this.suppr = suppr;
	}
	
	
	
}
