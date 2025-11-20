package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeomController {
	
	@GetMapping("/hello")
	public String printSomeThing() {
		
		return "hey hii.. it simple git demo...!";
		
		
	}

}
