package com.gl.AOPDemo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAOP 
{
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(LoggingAOP.class);

	@Pointcut("@annotation(com.gl.AOPDemo.myAnnotation.MyAnno)")
    public void pointcutExp(){}
	
	@Before("pointcutExp()")// joinpoint
	public void BeginTx()
	{
		 logger.info("Transaction support started");
	}
	
	@After("pointcutExp()")// joinpoint
	public void SendReport()
	{
		 logger.debug("report emailed");
	}
	
	@AfterReturning("pointcutExp()")
	public void CommitTx()
	{
		logger.info("Transaction commited");
	}
	
	@AfterThrowing(value="pointcutExp()",throwing="th")
	public void rollBackTx(Throwable th)
	{
		logger.error("Transaction rolled back, refund initiated "+th.getMessage());
	}

}
