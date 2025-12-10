package com.mph;

import com.mph.dao.OrdersDao;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	 OrdersDao dao=new OrdersDao();
    	 dao.addOrders();
    	 dao.findAll().forEach(System.out::println);
    }
}
