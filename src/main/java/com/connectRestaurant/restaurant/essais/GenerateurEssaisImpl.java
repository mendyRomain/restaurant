package com.connectRestaurant.restaurant.essais;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectRestaurant.restaurant.dao.BoissonRepository;
import com.connectRestaurant.restaurant.entities.Boisson;

@Service
public class GenerateurEssaisImpl implements GenerateurEssais{
	
	@Autowired
	BoissonRepository boissonRepository;
	
	
	@Override
	public void saveEssai() {
		// TODO Auto-generated method stub
		
		Boisson b01= new Boisson("coca", 5, false, 33, false, 0);
		Boisson b02= new Boisson("fanta", 5, false, 33, false, 0);
		Boisson b03= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b04= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b05= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b06= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b07= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b08= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b09= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b10= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b11= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b12= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b13= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b14= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b15= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b16= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b17= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b18= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b19= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b20= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b21= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b22= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b23= new Boisson("coca", 5, false, 50, false, 0);
		Boisson b24= new Boisson("coca", 5, false, 50, false, 0);
		boissonRepository.save(b01);
		boissonRepository.save(b02);
		boissonRepository.save(b03);
		boissonRepository.save(b04);
		boissonRepository.save(b05);
		boissonRepository.save(b06);
		boissonRepository.save(b07);
		boissonRepository.save(b08);
		boissonRepository.save(b09);
		boissonRepository.save(b10);
		boissonRepository.save(b11);
		boissonRepository.save(b12);
		boissonRepository.save(b13);
		boissonRepository.save(b14);
		boissonRepository.save(b15);
		boissonRepository.save(b16);
		boissonRepository.save(b17);
		boissonRepository.save(b18);
		boissonRepository.save(b19);
		boissonRepository.save(b20);
		boissonRepository.save(b21);
		boissonRepository.save(b22);
		boissonRepository.save(b23);
		boissonRepository.save(b24);
		
		
	}

}
