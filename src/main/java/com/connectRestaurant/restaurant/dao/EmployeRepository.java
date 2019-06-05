package com.connectRestaurant.restaurant.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.connectRestaurant.restaurant.entities.Employe;


public interface EmployeRepository extends JpaRepository<Employe, String>{
	@Query("SELECT e FROM Employe e WHERE e.idEmploye= :idEmp and e.suppr=false")
	Optional<Employe> findEmployeByIdEmp(@Param("idEmp") String idEmp);
	
	@Transactional
	@Modifying
	@Query("Update Employe SET suppr=true where idEmploye= :idEmploye")
	void deleteLogical(@Param("idEmploye") String idEmp);
	
	@Query("SELECT e FROM Employe e where e.suppr=false")
	List<Employe> findAllWhereDeletedFalse();
	
}
