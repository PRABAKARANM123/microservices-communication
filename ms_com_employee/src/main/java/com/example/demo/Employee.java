package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Employee {
	@Autowired
	private RestTemplate restTemplate;
	@GetMapping("employee")
	public String getEmployee() {
		
		String address = restTemplate.getForObject("http://localhost:8081/address", String.class);
		return "Prabakaran, 1203, dev "+address;
	}
}
