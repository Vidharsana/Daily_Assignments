package com.mph.entities;

import jakarta.persistence.Entity;

@Entity
public class Bottle extends Product{

	private String brand;
	private double bottleCost;
	private double capacity;
	public Bottle(int prodId, String prodName, String brand, double bottleCost, double capacity) {
		super(prodId, prodName);
		this.brand = brand;
		this.bottleCost = bottleCost;
		this.capacity = capacity;
	}
	public Bottle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bottle(int prodId, String prodName) {
		super(prodId, prodName);
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getBottleCost() {
		return bottleCost;
	}
	public void setBottleCost(double bottleCost) {
		this.bottleCost = bottleCost;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bottle [brand=" + brand + ", bottleCost=" + bottleCost + ", capacity=" + capacity + "]";
	}
	
	
}
