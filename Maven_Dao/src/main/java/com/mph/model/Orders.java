package com.mph.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;


@Entity
@Table(name="Order_tab")
@NamedQueries({@NamedQuery(name="Orders.findAll",query="From Orders")})
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ordId;
	private String ordName;
	private LocalDate ordDate;
	private double ordCost;
	private List<String> items;
	public Orders(int ordId, String ordName, LocalDate ordDate, double ordCost, List<String> items) {
		super();
		this.ordId = ordId;
		this.ordName = ordName;
		this.ordDate = ordDate;
		this.ordCost = ordCost;
		this.items = items;
	}
	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getOrdName() {
		return ordName;
	}
	public void setOrdName(String ordName) {
		this.ordName = ordName;
	}
	public LocalDate getOrdDate() {
		return ordDate;
	}
	public void setOrdDate(LocalDate ordDate) {
		this.ordDate = ordDate;
	}
	public double getOrdCost() {
		return ordCost;
	}
	public void setOrdCost(double ordCost) {
		this.ordCost = ordCost;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Orders [ordId=" + ordId + ", ordName=" + ordName + ", ordDate=" + ordDate + ", ordCost=" + ordCost
				+ ", items=" + items + "]";
	}
	
	
	
}
