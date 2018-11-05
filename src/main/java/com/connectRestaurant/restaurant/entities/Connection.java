package com.connectRestaurant.restaurant.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import org.springframework.web.bind.annotation.CrossOrigin;

@Entity
public class Connection {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private Date date;  
	
	@ManyToOne
	private Employe employe;

	public Connection() {
		super();
	}

	public Connection(Date date, Employe employe) {
		super();
		this.date = date;
		this.employe = employe;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Employe getEmployes() {
		return employe;
	}

	public void setEmployes(Employe employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Connection [id=" + id + ", date=" + date + ", employes=" + employe + "]";
	} 
	
	
	
	
	
	
}
