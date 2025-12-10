package com.mph;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mph.entities.IndianFood;
import com.mph.entities.Product;
import com.mph.entities.Vehicle;
import com.mph.utils.HibernateUtil;

/**
 * Hello world!
 */
public class App {
	
	private static final Logger logger=LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("Application started");
        Session session=HibernateUtil.buildSessionFactory().openSession();
        logger.info("session created");
        Transaction tx=session.beginTransaction();
        logger.info("Transaction started");
//        Product p=new Product(123,"laptop");
//        Vehicle v=new Vehicle("veh123","4 wheeler");
        IndianFood inf=new IndianFood("veg");
        session.save(inf);
        logger.info("persistent object inserted");
        tx.commit();
        logger.info("transaction commited");
        session.close();
        logger.info("session closed");
        
    }
}
