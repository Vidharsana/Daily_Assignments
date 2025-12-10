package com.mphasis.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		
		Course c=new Course(1,"Java",25000);
		session.save(c);
		Student s=new Student(1,"swapna","c","097563485","swapna@gmail.com");
		session.save(s);
		tx.commit();
		session.close();
		sessionFactory.close();
		
	}
}
