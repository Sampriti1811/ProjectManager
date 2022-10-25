package com.mjunction.prop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mjunction.prop.model.Property;

@Repository
public interface PropertyRepository extends JpaRepository<Property,Integer>{

	@Query("select p from Property p where prop_type=?1")
	List<Property> findByType(String prop_type);
	
	@Query("select p from Property p where city=?1")
	List<Property> findByCity(String city);
	
	@Query("select p from Property p where id=?1")
	Property findById(int id);
	
	
}