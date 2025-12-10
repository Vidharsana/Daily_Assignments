package com.mph.entities;

import jakarta.persistence.Entity;

@Entity
public class Laptop extends Product{

	private String brand;
	private double cost;
	public Laptop(int prodId, String prodName, String brand, double cost) {
		super(prodId, prodName);
		this.brand = brand;
		this.cost = cost;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Laptop(int prodId, String prodName) {
		super(prodId, prodName);
		// TODO Auto-generated constructor stub
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", cost=" + cost + "]";
	}
	
	
	
}
