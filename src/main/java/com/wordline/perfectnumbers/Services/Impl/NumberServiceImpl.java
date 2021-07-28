package com.wordline.perfectnumbers.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordline.perfectnumbers.Repository.NumberRepository;
import com.wordline.perfectnumbers.Services.NumberService;

@Service
public class NumberServiceImpl implements NumberService{

	@Autowired
	private NumberRepository numberRepository;
	

	@Override
	public Boolean check(Long number) {
		return this.numberRepository.check(number);
	}


	@Override
	public List<Long> checkRange(Long startNumber, Long endNumber) {
		return this.numberRepository.checkRange(startNumber,endNumber);
	}
	
}

