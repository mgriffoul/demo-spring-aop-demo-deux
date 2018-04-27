package com.spring.aop.demo.deux;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import com.spring.aop.demo.deux.pojo.Unicorn;
import com.spring.aop.demo.deux.service.IUnicornService;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class DemoSpringAopDemoDeuxApplication {

	@Autowired
	private IUnicornService unicornService;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAopDemoDeuxApplication.class, args);
	}

	@PostConstruct
	public void init(){
		Unicorn unicorn = new Unicorn();
		unicorn.setName("pinky");
		unicornService.callUnicorn(unicorn);
	}

}
