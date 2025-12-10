package com.mph;

import com.mph.dao.DepartmentDao;
import com.mph.dao.EmployeeDao;
import com.mph.entities.Department;
import com.mph.entities.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        
    	DepartmentDao deptDao=new DepartmentDao();
    	EmployeeDao empDao=new EmployeeDao();
    	Department dept=new Department("Training");
    	Employee e1=new Employee("Swapna");
    	Employee e2=new Employee("Amit");
    	Employee e3=new Employee("Keerthi");
    	
    	dept.addEmployee(e1);
    	dept.addEmployee(e2);
    	dept.addEmployee(e3);
    	//deptDao.addDepartment(dept);
    	
    	deptDao.findAll().forEach(System.out::println);
    	
    }
}
