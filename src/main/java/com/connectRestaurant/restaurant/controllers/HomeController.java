package com.connectRestaurant.restaurant.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.connectRestaurant.restaurant.entities.Boisson;
import com.connectRestaurant.restaurant.essais.GenerateurEssaisImpl;
import com.connectRestaurant.restaurant.metier.ConnectionMetierImplement;

import accessHomeClass.AccessHome;
import accessHomeClass.Validation;

@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	GenerateurEssaisImpl generateurEssaisImpl;
	
	@Autowired
	ConnectionMetierImplement connectionMetier;
	
	@PutMapping("/api/access")
	public Validation home(@RequestBody AccessHome connection) {
		Validation validation = connectionMetier.validation(connection);
		System.out.println();
		return validation;
	}
	
	@GetMapping("/essai")
	public String essai() {
		
		generateurEssaisImpl.saveEssai();
		return"pages/home";
	}
	
	@GetMapping("/versBackOffice")
	public String versBackOffice() {
		return"page/backOffice";
	}
	
}
