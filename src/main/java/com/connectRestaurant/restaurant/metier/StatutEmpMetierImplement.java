package com.connectRestaurant.restaurant.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.connectRestaurant.restaurant.dao.StatujtEmpRepository;
import com.connectRestaurant.restaurant.entities.StatutEmp;

@Service
public class StatutEmpMetierImplement implements StatutEmpMetier{
	
	@Autowired
	StatujtEmpRepository statutEmpRepository;
	
	@Override
	public List<StatutEmp> getStatutEmps() {
		return statutEmpRepository.findAll();
	}
	
}
