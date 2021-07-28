package com.wordline.perfectnumbers.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wordline.perfectnumbers.Services.NumberService;



@RestController
@RequestMapping("/api")
public class PerfectNumbersController {

	@Autowired
	private NumberService numberService;
	
	@GetMapping("/check")
	public Boolean perfectnumber(Long number) {
		return this.numberService.check(number);
	}
	
	@GetMapping("/check-range")
	public List<Long> perfectnumber(Long startNumber, Long endNumber) {
		return this.numberService.checkRange(startNumber, endNumber);
	}
	
}
