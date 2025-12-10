package com.mph.beans;

import java.util.List;

public class Person {

	private int id;
	private String name;
	private int age;
	
	
	private List<String> langs;
	
	private Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, int age, List<String> langs, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.langs = langs;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getLangs() {
		return langs;
	}

	public void setLangs(List<String> langs) {
		this.langs = langs;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", langs=" + langs + ", address=" + address
				+ "]";
	}

	

	
	
	
	
	
}
