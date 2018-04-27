package com.spring.aop.demo.service;

import org.springframework.stereotype.Service;
import com.spring.aop.demo.annotation.FluffyCheck;
import com.spring.aop.demo.pojo.Unicorn;

/**
 * Created by mathieu_griffoul on 27/04/2018.
 */
@Service
public class FurService {

	@FluffyCheck(furActionTrigger = "bruch")
	public void bruchFur(Unicorn unicorn){
		System.out.println("***Bruching " + unicorn.getName()+" ***");
	}

}
