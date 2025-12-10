package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mph.entities.Department;
import com.mph.utils.HibernateUtil;

public class DepartmentDao implements DepartmentDaoInterface{

	public List<Department> findAll(){
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Department> dlist= session.createQuery("From Department",Department.class).list();
		return dlist;
		
	}
	
	public void addDepartment(Department department) {
		Transaction tx;
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			tx=session.beginTransaction();
			session.save(department);
			tx.commit();
		}
	}
	
	public Department findById(int id) {
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			return session.get(Department.class, id);
		}
	}
}
