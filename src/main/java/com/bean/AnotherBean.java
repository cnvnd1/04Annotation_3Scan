package com.bean;

import org.springframework.stereotype.Component;

@Component //scan 대상
public class AnotherBean {
	
	String name ="홍길동";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
}
