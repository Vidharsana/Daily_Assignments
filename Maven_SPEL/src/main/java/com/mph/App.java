package com.mph;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mph.beans.Order;
import com.mph.config.ConfigClass;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
        Order o=(Order) context.getBean("order");
        System.out.println(o);
        context.close();
    }
}
