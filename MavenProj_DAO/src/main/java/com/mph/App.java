package com.mph;

import com.mph.dao.EmployeeDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        EmployeeDao dao=new EmployeeDao();
//        dao.addEmployee();
//        dao.findAll().forEach(System.out::println);
//        System.out.println(dao.findById(2));
//        
//        
//        dao.findByDept("HR").forEach(System.out::println);
        
        
        dao.findByFilters("HR Manager", null,0.0).forEach(System.out::println);;
        
    }
}
