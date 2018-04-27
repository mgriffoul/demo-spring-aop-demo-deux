package com.spring.aop.demo.deux.pojo;

import org.springframework.stereotype.Component;

/**
 * Created by mathieu_griffoul on 26/04/2018.
 */
@Component
public class Rainbow {

	private String size;
	private String location;

	public Rainbow() {
	}

	public Rainbow(String size, String location) {
		this.size = size;
		this.location = location;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


}
