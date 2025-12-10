package com.mph.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "emptable_Inh")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String ename;
	@ManyToOne
	@JoinColumn(name = "did",referencedColumnName = "did")
	private Department dept;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String ename) {
		super();
		this.ename = ename;
	}


	
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}


	public Employee(int eid, String ename, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.dept = dept;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dept=" + dept + "]";
	}
	
	
	
}
