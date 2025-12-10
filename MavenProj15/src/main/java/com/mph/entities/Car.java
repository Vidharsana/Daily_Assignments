package com.mph.entities;

import jakarta.persistence.Entity;

@Entity
public class Car extends Vehicle{

	private String brand;
	private String color;
	public Car(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + "]";
	}
	
}
