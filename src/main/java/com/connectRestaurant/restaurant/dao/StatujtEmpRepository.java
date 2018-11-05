package com.connectRestaurant.restaurant.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.connectRestaurant.restaurant.entities.StatutEmp;

public interface StatujtEmpRepository extends JpaRepository<StatutEmp, Long>{
	@Query("SELECT s FROM StatutEmp s join Employe e ON e.statutEmp=s.idStatutEmp WHERE e.idEmploye= :idEmp")
	StatutEmp getStatutjoinemploye(@Param("idEmp") String idEmp);
}
