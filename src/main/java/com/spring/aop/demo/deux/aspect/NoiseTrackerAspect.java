package com.spring.aop.demo.deux.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import com.spring.aop.demo.deux.pojo.Unicorn;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
@Aspect
@Component
public class NoiseTrackerAspect {

	@Before("execution(public void callUnicorn(..))")
	public void trackBeforeNoiseAdvice(){
		System.out.println(">>>>>>> A unicorn is going to be called and it will make noise >>>>>>>");
	}

	@After("execution(public void callUnicorn(..))")
	public void trackAfterNoiseAdvice(){
		System.out.println("<<<<<<<< A unicorn has been called and noise was made <<<<<<<<");
	}

	@Before("args(unicorn)")
	public void trackAfterNoiseAdvice2(Unicorn unicorn){
		System.out.println("<<<<<<<< A unicorn has been called and noise was made <<<<<<<<");
	}

}
