package com.mph;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mph.util.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Student s=new Student(127,"hem","AWS");
        session.save(s);
        System.out.println("object added successfully");
        tx.commit();
        
        //retrieve all students
        
        List<Student> studList=session.createQuery("From Student",Student.class).list();
        for(Student s1:studList)
        	System.out.println(s1);
        
        
        // UPDATE
        Session session2=factory.openSession();
        Transaction tx2 = session.beginTransaction();
        int updated = session.createQuery("update Student set course='Spring Boot' where sid=125").executeUpdate();
        System.out.println("Rows updated: " + updated);
        tx2.commit();

        // DELETE
        Session session3=factory.openSession();
        Transaction tx3 = session.beginTransaction();
        int deleted = session.createQuery("delete from Student where sid=125").executeUpdate();
        System.out.println("Rows deleted: " + deleted);
        tx3.commit();


        
        
        session.close();
        factory.close();
    }
}
