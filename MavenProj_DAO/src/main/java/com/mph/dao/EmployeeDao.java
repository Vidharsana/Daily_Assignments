package com.mph.dao;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mph.model.Employee;
import com.mph.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class EmployeeDao implements EmployeeDaoInterface{

	@Override
	public List<Employee> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> empList=session.createNamedQuery("Employee.findAll",Employee.class).list();
		session.close();
		return empList;
	}

	@Override
	public Employee findById(int i) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Employee e=session.get(Employee.class,i);
		session.close();
		return e;
	}

	@Override
	public void addEmployee() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Employee e=new Employee(125,"Thari",50000,"HR","HR Manager");
		session.save(e);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		
		return null;
	}

	@Override
	public void deleteEmployee(int id) {
		
		
	}

	@Override
	public List<Employee> findByDept(String dept) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Employee> q=session.createNamedQuery("Employee.findByDept()",Employee.class);
		q.setParameter("dept", dept);
		List<Employee> empList=q.list();
		session.close();
		return empList;
		
	}

	@Override
	public List<Employee> findByFilters(String desg, String dept, double salary) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		CriteriaBuilder cb=session.getCriteriaBuilder();
		CriteriaQuery<Employee> cq=cb.createQuery(Employee.class);
		Root<Employee> root=cq.from(Employee.class);
		List<Predicate> predicates=new ArrayList<Predicate>();
		if(dept!=null&&dept.isEmpty())
			predicates.add((Predicate) cb.equal(root.get("dept"),dept));
		
		if(desg!=null&&desg.isEmpty())
			predicates.add((Predicate) cb.equal(root.get("desg"),desg));
		
		if(salary!=0)
			predicates.add((Predicate) cb.greaterThanOrEqualTo(root.get("salary"),salary));
		
		cq.where(predicates.toArray(new Predicate[0]));
		List<Employee> empList=session.createQuery(cq).getResultList();
		session.close();
		return empList;
	}

	

	

}
