package com.spring.aop.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by mathieu_griffoul on 27/04/2018.
 */
@Service
public class AgeService {

	public void isOldOrYoung(String age){
		if(Integer.valueOf(age)>60){
			System.out.println("==== this unicorn is "+ age + " = its old");
		}else {
			System.out.println("==== this unicorn is "+ age + " = its young");
		}
	}

}
