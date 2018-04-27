package com.spring.aop.demo.deux.service;

import com.spring.aop.demo.deux.pojo.Unicorn;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
public interface IUnicornService {

	void callUnicorn(Unicorn unicorn);

	void sayUnicornAge(Unicorn unicorn);

}
