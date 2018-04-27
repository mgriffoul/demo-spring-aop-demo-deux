package com.spring.aop.demo.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import com.spring.aop.demo.annotation.FluffyCheck;

/**
 * Created by mathieu_griffoul on 27/04/2018.
 */
@Component
@Aspect
public class FluffyAspect {


	@Around("@annotation(fluffyCheck)")
	public Object log(ProceedingJoinPoint proceedingJoinPoint, FluffyCheck fluffyCheck) throws Throwable {

		System.out.println("Checker is called by " + fluffyCheck.furActionTrigger());
		Object value = null ;
		try {
			value = proceedingJoinPoint.proceed();

		} catch(Throwable e) {
			throw e;
		}

		if("Richard".equals((String) value)){
			System.out.println("its not fluffy :(");
		}else {
			System.out.println("ITS fluffy :D");
		}

		return value;
	}


}
