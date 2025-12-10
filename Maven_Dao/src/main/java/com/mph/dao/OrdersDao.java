package com.mph.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.mph.model.Orders;
import com.mph.util.HibernateUtil;

public class OrdersDao implements OrderDaoInterface{

	@Override
	public List<Orders> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Orders> ordList=session.createNamedQuery("Orders.findAll",Orders.class).list();
		session.close();
		return ordList;
	}

	@Override
	public Orders findById(int i) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Orders o=session.get(Orders.class,i);
		session.close();
		return o;
	}

	@Override
	public void addOrders() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		Orders o=new Orders(104,"skincare",LocalDate.parse("2020-07-14"),5000,Arrays.asList("cleanser", "serum", "sunscreen"));
		session.save(o);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Orders updateOrders(Orders orders, int id) {
		
		return null;
	}

	@Override
	public void deleteOrders(int id) {
		
		
	}

}
