package com.connectRestaurant.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.connectRestaurant.restaurant.essais.GenerateurEssaisImpl;

@Controller
public class HomeController {
	@Autowired
	GenerateurEssaisImpl generateurEssaisImpl;
	
	@GetMapping("/")
	public String home() {
		return "pages/home";
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
