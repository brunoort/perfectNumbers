package com.wordline.perfectnumbers.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class NumberRepository {
	
	public Boolean check(Long number) {
		return this.isPerfectNumber(number);
	}
	
	public List<Long> checkRange(Long startNumber, Long endNumber) {
		List<Long> resultList = new ArrayList<>();	
		Long start = startNumber;
		Long end = endNumber;
		
		while(start <= end) {
			Boolean result = this.isPerfectNumber(start);
			
			if(result) {
				resultList.add(start);
			}
			
			start++;
		}
		
		return resultList;
	}
	
	private Boolean isPerfectNumber(Long number) {
		long sum=0;  
		int i=1;  
		
		while(i <= number/2)  
		{  
			if(number % i == 0)  
			{  
				sum = sum + i;  
			} 
			i++;  
		} 
		
		if(sum == number)  
		{  
			return true; 
		} else  {
			return false;
		}  
	}
}
