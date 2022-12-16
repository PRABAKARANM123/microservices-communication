package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Address {
	@GetMapping("address")
	public String getAddress() {
		
		return "Velachery, Chennai, 42";
	}

}
