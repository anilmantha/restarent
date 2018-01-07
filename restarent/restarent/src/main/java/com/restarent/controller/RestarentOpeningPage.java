package com.restarent.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
public class RestarentOpeningPage {
	
	
	@RequestMapping("/openRestarentPage")
	public String openRestarentPage() {
		
		
		return "restarent";
		
	}
	
	@RequestMapping("/saveRestarentData")
	public String saveRestarentPage() {
		
		
		return "restarent";
		
	}
	

}
