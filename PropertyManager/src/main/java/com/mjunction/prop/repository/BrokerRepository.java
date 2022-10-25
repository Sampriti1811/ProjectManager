package com.mjunction.prop.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mjunction.prop.model.Broker;

@Repository
public interface BrokerRepository extends JpaRepository<Broker,Integer>{

	@Query("Select b from Broker b where b.br_username=?1")
	Optional<Broker> findByUserName(String br_username);
}
