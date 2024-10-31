package com.example.citizenservice.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

	@PostMapping("/add")
	public void addCitizen() {
		
	}
	
	
	@PutMapping("/update")
	public void updateCitizen() {
		
	}
	
	@GetMapping("/all")
	public void getAllCitizens() {
		
	}
}
