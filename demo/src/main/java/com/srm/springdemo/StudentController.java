package com.srm.springdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


	
	@RestController
	@RequestMapping("/Student")
	public class StudentController {
		
		//http://localhost:8080/student
//		@GetMapping("{firstName}/{lastName}")
//		public Student displayMessage(@PathVariable("firstName") String firstName, @PathVariable("lastName")String lastName)
//		 {
//			return new Student(firstName , lastName);
//		 }
//		
		//http://localhost:8080/Student?firstName=Niti&lastName=Dwivedi
		@GetMapping("/query")
		public Student displayMessage(
				
				@RequestParam(name="firstName") String firstName,
				@RequestParam(name="lastName") String lastName
				)
		 {
			return new Student(firstName , lastName);
		 }

	}



