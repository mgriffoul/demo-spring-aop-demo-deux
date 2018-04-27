package com.spring.aop.demo.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import com.spring.aop.demo.pojo.Unicorn;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
@Aspect
@Component
public class NoiseTrackerAspect {

	//POINCUT
	@Pointcut("execution(public void callUnicorn(com.spring.aop.demo.pojo.Unicorn))")
	public void commonPointcut(){}



	//ADVICE
	@Before("commonPointcut()")
	public void trackerNoiseAdvice(JoinPoint joinPoint){

		System.out.println(">>>>>>> A unicorn is going to be called and it will make noise >>>>>>>");
	}

	@After("commonPointcut()")
	public void trackAfterNoiseAdvice(){
		System.out.println("<<<<<<<< A unicorn has been called and noise was made <<<<<<<<");
	}

	@After("commonPointcut() && args(unicorn)")
	public void trackAfterNoiseAdvice2(Unicorn unicorn){
		System.out.println("The unicorn who made some noise was : "+unicorn.getName());
	}

}
