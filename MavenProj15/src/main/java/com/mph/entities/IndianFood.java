package com.mph.entities;

import jakarta.persistence.Entity;

@Entity
public class IndianFood extends Food{

	private String type;

	public IndianFood(String type) {
		super();
		this.type = type;
	}

	public IndianFood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "IndianFood [type=" + type + "]";
	}
	
	
}
