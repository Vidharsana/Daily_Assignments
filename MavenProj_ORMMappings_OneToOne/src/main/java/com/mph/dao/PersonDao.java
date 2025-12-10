package com.mph.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mph.entities.Passport;
import com.mph.entities.Person;
import com.mph.utils.HibernateUtil;

public class PersonDao implements PersonDaoInterface{

	private static final Logger logger=LoggerFactory.getLogger(PersonDao.class);
	
	@Override
	public List<Person> findAll() {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		logger.info("Fetching all person details");
		List<Person> personList=session.createQuery("From Person",Person.class).list();
		session.close();
		return personList;
	}

	@Override
	public void addPerson(Person person) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		session.save(person);
		transaction.commit();
		logger.info("person record added successfully");
		session.close();
		
	}

	@Override
	public Person findById(Long id) {
		Session session=HibernateUtil.buildSessionFactory().openSession();
		Person p=session.get(Person.class, id);
		session.close();
		logger.info("Person details with id {}, {}",id,p);
		return p;
	}

	@Override
	public Person findByPersonIdWithPassportDetails(Long id) {
		
		return null;
	}

}
