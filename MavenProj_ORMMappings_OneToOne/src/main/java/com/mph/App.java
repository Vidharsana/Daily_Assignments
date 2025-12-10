package com.mph;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mph.dao.PassportDao;
import com.mph.dao.PersonDao;
import com.mph.entities.Passport;
import com.mph.entities.Person;

/**
 * Hello world!
 */
public class App {
	private static final Logger logger=LoggerFactory.getLogger(PassportDao.class);

	
    public static void main(String[] args) {
    	logger.info("App started");
       Passport pass1=new Passport(2l,"India125");
       logger.info("passport generation {}",pass1);
       Person person=new Person("hem","9876543567","hem@gmail.com");
       person.setPassport(pass1);
       logger.info("person object created successfully {}",person);
       PersonDao dao=new PersonDao();
       
       dao.addPerson(person);
//       dao.findAll().forEach(System.out::println);
//       System.out.println(dao.findById(1l));
       
//       PassportDao dao1=new PassportDao();
//       System.out.println(dao1.findByPersonId(1l));
       logger.info("dao updated person status");
       logger.info("App closed");
    }
}
