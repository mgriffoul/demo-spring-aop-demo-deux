package com.spring.aop.demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by mathieu_griffoul on 27/04/2018.
 */
@Aspect
@Component
public class StatAgeAspect {


	//POINTCUT
	@Pointcut("execution(public void isOldOrYoung(String))")
	public void callUnicornPointcut() {
	}

	@Around("callUnicornPointcut() && args(age)")
	public Object trackOldOrYoung (ProceedingJoinPoint proceedingJoinPoint, String age){

		System.out.println(">>>>>>> we are gonna look some unicorn's age");

		Object value = null;

		try{
			value = proceedingJoinPoint.proceed();
		}catch(Throwable t){
			t.printStackTrace();
		}

		System.out.println("<<<<<<<<< adding " + age + ". So total age is now " + age);

		return value;
	}


}
