package com.spring.aop.demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.spring.aop.demo.pojo.Unicorn;
import com.spring.aop.demo.service.FurService;
import com.spring.aop.demo.service.IUnicornService;

@SpringBootApplication
public class DemoSpringAopDemoDeuxApplication {

	@Autowired
	private IUnicornService unicornService;

	@Autowired
	private FurService furService;

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringAopDemoDeuxApplication.class, args);
	}

	@PostConstruct
	public void init(){
		Unicorn unicorn = new Unicorn();
		unicorn.setName("Pinky");
		unicorn.setAge("70");
		unicornService.callUnicorn(unicorn);
		unicornService.sayUnicornAge(unicorn);
		unicornService.sayIfUnicornIsOld(unicorn);
		furService.bruchFur(unicorn);
	}

}
