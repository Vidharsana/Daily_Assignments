package com.mph.dao;

import java.util.List;

import com.mph.entities.Employee;

public interface EmployeeDaoInterface {

	public List<Employee> findAll();
	public void addEmployee(Employee e);
	public Employee findById(int id);
}
