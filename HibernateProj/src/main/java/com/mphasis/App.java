package com.mphasis;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.model.Course;
import com.mphasis.model.Student;



public class App {
    public static void main(String[] args) {
       Configuration cfg=new Configuration().configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Transaction txn=session.beginTransaction();
       //Insert into student
//       Student s=new Student(125,"Praveen","Java","1234567890","praveen@gmail.com");
//       session.save(s);
//       	 System.out.println("Record added successfully");
//       txn.commit();
       //Get all students
       List<Student> studList=session.createQuery("From Student ",Student.class).list();
       for(Student a:studList) {
    	   System.out.println(a);
       }
       //get single student
//       Student s1=session.get(Student.class,1 );
//       System.out.println(s1);
       
       //update student
//       Student s=session.get(Student.class, 1);
//       if(s!=null) {
//    	   s.setMobile("9988877654");
//    	   s.setStudName("Parveen banu");
//    	   s.setEmail("parveen.banu@example.com");
//    	   s.setCourse("Spring");
//       	   session.update(s);
//       }
//       else {
//    	   System.out.println("No student found");
//       }
//       
//       
       
       //delete student
//       Student s=session.get(Student.class, 1);
//       if(s!=null) {
//    	   session.delete(s);
//    	   System.out.println("Deleted successfully");
//       }
//       else {
//    	   System.out.println("No student found");
//       }
       
       
//       Course c=new Course(1,"java",25000);
//       session.save(c);
//       System.out.println("course inserted successfully");
//       
       
       
//       List<Course> courseList=session.createQuery("From Course ",Course.class).list();
//       for(Course a1:courseList) {
//    	   System.out.println(a1);
//       
//       } 
//       txn.commit();
//       session.close();
//       factory.close();
//       
    }
}