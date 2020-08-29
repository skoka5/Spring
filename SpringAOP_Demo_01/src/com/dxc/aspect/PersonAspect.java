package com.dxc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class PersonAspect {
	
	
	@Before("execution(String getName())")
	public void getNameAdvise() {
		System.out.println("advice before getter");
	}
	
	@Before("execution(* get*())")
	public void getIdAdvice() {
		System.out.println("advise before getter with wildcard character");
	}
	
	//@Before("execution(public void setName(String))")
	@Before("setNamePointcut()")
	public void setAdvice() {
		System.out.println("first advice before setter method");
	}
	
	//@Before("execution(public void setName(String))")
	@Before("setNamePointcut()")
	public void setSecondAdvice() {
		System.out.println("second advice before setter method");
	}

	//@Before("execution(public void setName(String))")
	@Before("setNamePointcut()")
	public void setThirdAdvice() {
		System.out.println("third advice before setter method");
	}
	
	@Pointcut("execution(public void setName(String))")
	public void setNamePointcut() {
//		Dummy method
//		this pointcut is to be applied for different join points.
	}
	
//	@Pointcut("within(com.dxc.model.*)")
//	public void allMethodsPointcut() {
//		
//	}
}
