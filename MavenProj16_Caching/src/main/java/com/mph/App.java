package com.mph;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mph.entities.Item;
import com.mph.utils.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Session session1=HibernateUtil.buildSessionFactory().openSession();
//        Session session2=HibernateUtil.buildSessionFactory().openSession();
//        Session session3=HibernateUtil.buildSessionFactory().openSession();
        
        Item i1=new Item("Laptop", 70000.0);
        Transaction t=session1.beginTransaction();
        session1.save(i1);
        t.commit();
        session1.close();
        
//        session2.get("Item.class", t);
        
    }
}
