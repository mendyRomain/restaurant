package com.connectRestaurant.restaurant.metier;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectRestaurant.restaurant.dao.ConnectionRepository;
import com.connectRestaurant.restaurant.dao.EmployeRepository;
import com.connectRestaurant.restaurant.dao.StatujtEmpRepository;
import com.connectRestaurant.restaurant.entities.Connection;
import com.connectRestaurant.restaurant.entities.Employe;
import com.connectRestaurant.restaurant.entities.StatutEmp;

import accessHomeClass.AccessHome;
import accessHomeClass.Validation;

@Service
public class ConnectionMetierImplement implements ConnectionMetier {

	@Autowired
	ConnectionRepository connectionRepository;

	@Autowired
	EmployeRepository employeRepository;

	@Autowired
	StatujtEmpRepository statutEmprepository;

	@Override
	public Validation validation(AccessHome connection) {
		String phrase ="";
		Validation validation = new Validation();
		if(connection.getId()!= null) {
		Optional<Employe> employe = employeRepository.findById(connection.getId());
		

		if (employe.isPresent() == true) {
			Employe employeValue = employe.get();

			String nomInterface = connection.getNomInterface();
			StatutEmp statutEmp = statutEmprepository.getStatutjoinemploye(employeValue.getIdEmploye());
			
			boolean emploiOk = false;
			System.out.println("nom interface = "+nomInterface);
			switch (nomInterface) {
			case "caisse":
				emploiOk = statutEmp.isCaisse(); 
				break;
			case "client":
				emploiOk = statutEmp.isSalle();
				break;
			case "cuisine":
				emploiOk = statutEmp.isCuisine();
				break;
			case "serveur":
				emploiOk = statutEmp.isEmpSalle();
				break;
			case "backOffice":
				emploiOk = statutEmp.isBackOffice();
				break;
			default:
				emploiOk = false;
				break;
			}
			System.out.println("résultat après switch = "+emploiOk);
			System.out.println("mot de passe saisie = "+connection.getMdp());
			System.out.println("mot de passe base de donnée = "+employeValue.getMdp());
			System.out.println(connection.getMdp());
			System.out.println(employeValue.getMdp());
			System.out.println(employeValue.getMdp().equals( connection.getMdp()));
			if (employeValue.getMdp() .equals( connection.getMdp()) && emploiOk) {
				validation.setOk(true); 
				Connection connect =new Connection(new Date(), employeValue);
				connectionRepository.save(connect);
			}else {
				if(!emploiOk) {
					phrase += "Vous n'avez pas les droits!!";
				}
				if(!employeValue.getMdp() .equals( connection.getMdp())) {
					phrase += " Le mot de passe est incorrect";
				}
			}
			
		}else {
			phrase += "L'id n'a pas été trouvé!!";
		}
		}else {
			phrase += "veuillez remplir l'id";
		}
		System.out.println("valeur validation = "+validation);
		validation.setPhrase(phrase);
		return validation;
	}

}
