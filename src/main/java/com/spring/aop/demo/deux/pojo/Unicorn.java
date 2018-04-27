package com.spring.aop.demo.deux.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
@Component
public class Unicorn {

	private String color;
	private String age;
	private String name;

	public Unicorn() {
	}

	public Unicorn(String color, String age, String name) {
		this.color = color;
		this.age = age;
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
