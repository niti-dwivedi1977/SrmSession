package com.gl.AOPDemo.service;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.gl.AOPDemo.myAnnotation.MyAnno;

@Service
public class BusinessClass
{
		@MyAnno
	public void businessMethod()
	{
		System.out.println("business method executed");
		System.out.println(10/0);
		
	}

}
