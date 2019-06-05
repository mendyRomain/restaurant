package com.connectRestaurant.restaurant.metier;

import java.util.List;

import com.connectRestaurant.restaurant.entities.Employe;

import accessHomeClass.Validation;

public interface EmployeMetier {
	public Validation addEmploye(Employe employe);
	
	public List<Employe> getEmployes();
	
	public Validation deleteLogicalEmploye(Employe employe);
}
