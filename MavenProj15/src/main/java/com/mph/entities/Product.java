package com.mph.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

//single table strategy
@Entity
@Table(name="prod_table")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Product {

	@Id
	private int prodId;
	private String prodName;
	public Product(int prodId, String prodName) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + "]";
	}
	
	
}
