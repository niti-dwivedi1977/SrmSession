package com.srm.servicesjavabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.srm.beansXmlBased.Address;

@Configuration
public class BeanConfig {
	
	@Bean("emp12")
	public Employee12 getEmployee()
	{
		
		return new Employee12();
	}
	
	@Bean("addr1")
	public Address getAddress()
	{
		return null;
		
	}
	
	

}
