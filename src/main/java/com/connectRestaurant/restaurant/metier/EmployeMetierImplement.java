package com.connectRestaurant.restaurant.metier;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;
import org.springframework.stereotype.Service;

import com.connectRestaurant.restaurant.dao.EmployeRepository;
import com.connectRestaurant.restaurant.entities.Employe;

import accessHomeClass.Validation;

@Service
public class EmployeMetierImplement implements EmployeMetier {
	
	@Autowired
	private EmployeRepository employeRepository; 
	
	@Override
	public Validation addEmploye(Employe employe) {
		Employe employeValid;
		Validation validation = new Validation();
		Optional<Employe> employeIsPresent = employeRepository.findEmployeByIdEmp(employe.getIdEmploye());
		if(!employeIsPresent.isPresent()) {
			employeValid = employeRepository.save(employe);
			if(employeValid != null) {
				validation.setOk(true);
				validation.setPhrase("L'employe a bien été enregistré");
			}
		}else {
			validation.setOk(false);
			validation.setPhrase("L'idendificateur "+employe.getIdEmploye()+" est déja utilisé!");
		}
		
		return validation;
	}
	
	@Override
	public List<Employe> getEmployes(){
		return employeRepository.findAllWhereDeletedFalse();
	}

	@Override
	public Validation deleteLogicalEmploye(Employe employe) {
		
		Validation validation= new Validation();
		validation.setOk(false);
		validation.setPhrase("erreur SQL");
		employeRepository.deleteLogical(employe.getIdEmploye());
		validation.setOk(true);
		validation.setPhrase("l'employe a bien été supprimé");
		return validation;
		
	}

}
