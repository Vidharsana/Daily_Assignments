package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mph.entities.Employee;
import com.mph.utils.HibernateUtil;

public class EmployeeDao implements EmployeeDaoInterface{

	public List<Employee> findAll(){
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> elist=session.createQuery("From Employee",Employee.class).list();
		session.close();
		return elist;
	}
	
	public void addEmployee(Employee e) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction t=session.beginTransaction();
		session.save(e);
		t.commit();
		session.close();
		System.out.println("record inserted");
	}
	
	public Employee findById(int id) {
		try(Session session=HibernateUtil.buildSessionFactory().openSession()) {
			return session.get(Employee.class,id);
		}
	}
	
}
