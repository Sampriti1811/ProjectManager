package com.mjunction.prop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mjunction.prop.model.Deal;
import com.mjunction.prop.repository.DealRepository;

@Component("dealService")
public class DealServiceImp implements DealService{
	
	@Autowired
	DealRepository dealRepository;
	
	public void saveDeal(Deal deal) {
		dealRepository.save(deal);
	}

}