package com.spring.aop.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.aop.demo.pojo.Unicorn;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
@Service
public class UnicornService implements IUnicornService {

	@Autowired
	private AgeService ageService;

	@Override
	public void callUnicorn(Unicorn unicorn) {
		System.out.println("~~~~Hoé " + unicorn.getName()+"~~~~");
	}

	@Override
	public void sayUnicornAge(Unicorn unicorn) {
		System.out.println("//////"+unicorn.getName() + " is " + unicorn.getAge() + "years old/////");
	}

	@Override
	public void sayIfUnicornIsOld(Unicorn unicorn) {
		System.out.println("==== Is this unicorn old or young ? ");
		ageService.isOldOrYoung(unicorn.getAge());
	}


}
