package com.gl.AOPDemo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass
{
	@Pointcut("execution(public * com.gl.AOPDemo.service.BusinessClass.businessMethod()")
    public void pointcutExp(){}
	
	@Pointcut("@annotation(com.gl.AOPDemo.myAnnotation.MyAnno)")
    public void pointcutExp2(){}
	
//	@Before("pointcutExp()")// joinpoint
//	public void BeginTx()
//	{
//		 System.out.println("Transaction support started");
//	}
//	
//	@After("pointcutExp()")// joinpoint
//	public void SendReport()
//	{
//		 System.out.println("report emailed");
//	}
//	
//	@AfterReturning("pointcutExp()")
//	public void CommitTx()
//	{
//		System.out.println("Transaction commited");
//	}
//	
//	@AfterThrowing(value="pointcutExp()",throwing="th")
//	public void rollBackTx(Throwable th)
//	{
//		System.out.println("Transaction rolled back, refund initiated "+th.getMessage());
//	}
	
	@Around("pointcutExp2()")
	public void aroundTest(ProceedingJoinPoint jp)
	{
		//before advice
		System.out.println("transaction support initiated for the payment");
				
		try {
			jp.proceed();//code to call business method
			//after returning	advice	
			System.out.println("Transaction commited, payment successful ! order placed");
		}
		catch(Throwable e) {
			// after throwing
			System.out.println(e.getMessage()+"Transaction rolled back, refund initiated");
		}
		 // after advice
		 System.out.println("report emailed");
	}
	
	
	
}
