package com.mph.beans;

public class Hello {

	private String name;
	
	
	public void setName(String name) {
		this.name = name;
	}

	public Hello(String name) {
		super();
		this.name = name;
	}

	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String sayHello() {
		return "Hello.....!"+name;
	}
}
