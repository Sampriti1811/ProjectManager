package com.mjunction.prop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mjunction.prop.model.Deal;

@Repository
public interface DealRepository extends JpaRepository<Deal, Integer>{

}