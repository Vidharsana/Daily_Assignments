package com.mph;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mph.beans.Employee;
import com.mph.beans.Hello;
import com.mph.beans.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	ApplicationContext context=new ClassPathXmlApplicationContext("employee-bean.xml");
//    	Hello h=(Hello)context.getBean("hello");
//    	System.out.println(h.sayHello());
    	
//    	Person p=(Person) context.getBean("p");
//    	System.out.println(p);
//    	System.out.println(p.hashCode());
//    	
//    	
//    	Person p1=(Person)context.getBean("p");
//    	System.out.println(p1.hashCode());
    	
    	
    	Employee e=(Employee) context.getBean("emp");
    	System.out.println(e);
    	
    }
}
