package com.srm.springdemo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.srm.springdemo.sub1.SpringComponent;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx1  =	SpringApplication.run(DemoApplication.class, args);
		
	    SpringComponent component = ctx1.getBean(SpringComponent.class);
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println(component.getMessage());
	
	}

}
