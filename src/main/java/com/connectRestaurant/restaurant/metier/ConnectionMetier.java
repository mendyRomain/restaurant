package com.connectRestaurant.restaurant.metier;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import accessHomeClass.AccessHome;
import accessHomeClass.Validation;

public interface ConnectionMetier {
	public Validation validation(AccessHome connection );
	
	
}
