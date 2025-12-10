package com.mph;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mph.beans.Student;
import com.mph.config.SpringConfiguration;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Student s= (Student)context.getBean(Student.class);
		System.out.println(s);
		context.close();
	}
}
