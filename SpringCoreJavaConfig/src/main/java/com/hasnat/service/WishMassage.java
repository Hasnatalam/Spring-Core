package com.hasnat.service;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component("wm")
public class WishMassage {
	@Autowired
	private LocalTime lt;
	private LocalDate ld;
	
	@Autowired
	public void setLd(LocalDate ld) {
		this.ld = ld;
	}
		
	public void wish() {
		System.out.println("Welcome to xml config Example");
		System.out.println(lt);
		System.out.println(ld);
	}

	
	
	
	
}
