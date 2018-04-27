package com.spring.aop.demo.aop.pointcut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by mathieu_griffoul on 27/04/2018.
 */
public class CommonPoincut {

	@Pointcut("execution(public void callUnicorn(com.spring.aop.demo.pojo.Unicorn))")
	public void commonPointcut(){}

}
