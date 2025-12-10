package com.mph.dao;

import java.util.List;

import com.mph.model.Orders;

public interface OrderDaoInterface {

	public List<Orders> findAll();
	public Orders findById(int i);
	public void addOrders();
	public Orders updateOrders(Orders orders,int id);
	public void deleteOrders(int id);
}
