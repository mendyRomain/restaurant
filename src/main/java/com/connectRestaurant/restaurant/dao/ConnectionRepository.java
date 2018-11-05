package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.connectRestaurant.restaurant.entities.Connection;

public interface ConnectionRepository extends JpaRepository<Connection, Long> {
	
}
