package com.mph.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Food {

	@Id
	private int foodId;
	private String foodName;
	public Food(int foodId, String foodName) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getFoodId() {
		return foodId;
	}
	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	@Override
	public String toString() {
		return "Food [foodId=" + foodId + ", foodName=" + foodName + "]";
	}
	
	
}
