package com.srm.beansXmlBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srm.annotationbased.Customer;
import com.srm.annotationbased.CustomerAddress;
import com.srm.annotationconfig.CustomerConfig;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Application Container
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
//		Employee emp1 = (Employee) context.getBean("emp1");
//		
//      emp1.welcome();
//      System.out.println(emp1.toString());
		
		
//		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
//		Employee12 emp = context.getBean("emp12" , Employee12.class);
//		emp.welcome();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(CustomerConfig.class);
		Customer cust = context.getBean(Customer.class);
		CustomerAddress cust1 = context.getBean(CustomerAddress.class);
		cust.welcomeCust();
		cust1.add();
		
	}

}
