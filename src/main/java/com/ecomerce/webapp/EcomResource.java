package com.ecomerce.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcomResource {
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(value = "name", defaultValue="World") String name) {
		return "Hello ! , " + name;
	}
	
	@GetMapping("/")
	public String index() {
		return "Hello, Project Phase 5, DEVESH SINGH, BIT MESRA(2018-2022) ! ";
	}
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello!";
	}
}
