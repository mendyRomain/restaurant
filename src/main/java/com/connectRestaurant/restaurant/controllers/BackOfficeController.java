package com.connectRestaurant.restaurant.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connectRestaurant.restaurant.entities.Employe;
import com.connectRestaurant.restaurant.entities.StatutEmp;
import com.connectRestaurant.restaurant.metier.EmployeMetier;
import com.connectRestaurant.restaurant.metier.StatutEmpMetier;

import accessHomeClass.Validation;

@RestController
@CrossOrigin("*")
public class BackOfficeController {
	
	@Autowired
	private EmployeMetier employeMetier;
	
	@Autowired
	private StatutEmpMetier statutEmpMetier;
	
	@PutMapping("/api/addEmploye")
	public Validation addEmploye(@RequestBody Employe employe) {
		Validation validation =employeMetier.addEmploye(employe);
		return validation;
	}
	
	@GetMapping("/api/getDroits")
	public List<StatutEmp> getDroits() {
		return statutEmpMetier.getStatutEmps();
	}
	
	@GetMapping("/api/getEmployes")
	public List<Employe> getEmployes(){
		return employeMetier.getEmployes();
	}
	
	@PostMapping("/api/deleteEmploye")
	public Validation deleteEmploye(@RequestBody Employe employe) {
		Validation validation = employeMetier.deleteLogicalEmploye(employe);
		return validation;
	}
}
