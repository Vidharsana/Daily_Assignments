package com.mph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mph.beans.Course;
import com.mph.beans.Student;

@Configuration
@ComponentScan(basePackages = "com.mph")
@PropertySource("classpath:data.properties")
public class SpringConfiguration {

//	@Bean
//	public Student getStudent() {
//		return new Student(22, "karthik", getCourse());
//	}
//	
//	@Bean
//	public Course getCourse() {
//		return new Course(222,"spring");
//	}
	
}
