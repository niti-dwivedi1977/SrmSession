package com.srm.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("User")
public class ControllerClass {
	
	//http://localhost:8080/message
	@GetMapping("/message")
	public String displayMessage()
	 {
		return " Web Spring Boot result on Browser";
		
	 }

}
