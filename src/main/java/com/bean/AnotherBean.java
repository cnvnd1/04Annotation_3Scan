package com.bean;

import org.springframework.stereotype.Component;

@Component //scan 대상
public class AnotherBean {
	
	String name ="이영애";

	public String getName() {
		System.out.println("setter");
		return name;
		
	}

	public void setName(String name) {
		System.out.println("anotherBean");
		this.name = name;
	}

	

	
}
