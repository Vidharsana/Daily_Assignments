package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mph.entities.Passport;
import com.mph.utils.HibernateUtil;

public class PassportDao implements PassportDaoInterface{

	private static final Logger logger=LoggerFactory.getLogger(PassportDao.class);

	@Override
	public List<Passport> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		logger.info("Fetching all person details");
		List<Passport> passportList=session.createQuery("From Passport",Passport.class).list();
		session.close();
		return passportList;
	}

	@Override
	public void addPassport(Passport passport) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(passport);
		transaction.commit();
		logger.info("passport record added successfully");
		session.close();
		
	}

	@Override
	public Passport findById(Long id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Passport p=session.get(Passport.class, id);
		session.close();
		logger.info("Passport details with id {}, {}",id,p);
		return p;
	}

	@Override
	public Passport findByPersonId(Long pid) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Query<Passport> q=session.createQuery("From Passport where p.person.id=pid",Passport.class);
		q.setParameter("pid", pid);
		Passport pass=q.getSingleResult();
		session.close();
		return pass;
	}

	

	

}
