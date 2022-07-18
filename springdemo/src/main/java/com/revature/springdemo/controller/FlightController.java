package com.revature.springdemo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/flight")
public class FlightController {
	
	@GetMapping("/searchflight")
	public String searchFlight() {
		return "Searching for flight";
	}

}