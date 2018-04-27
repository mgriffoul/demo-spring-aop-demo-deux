package com.spring.aop.demo.deux.service;

import org.springframework.stereotype.Service;
import com.spring.aop.demo.deux.pojo.Unicorn;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
@Service
public class UnicornService implements IUnicornService {

	@Override
	public void callUnicorn(Unicorn unicorn) {
		System.out.println("Hoé " + unicorn.getName());
	}

	@Override
	public void sayUnicornAge(Unicorn unicorn) {
		System.out.println(unicorn.getName() + " is " + unicorn.getAge() + "years old");
	}

}
