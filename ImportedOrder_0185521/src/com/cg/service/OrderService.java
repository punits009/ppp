package com.cg.service;

import com.cg.bean.Order;

public interface OrderService {
	public int calculateOrder(Order o); 
	public double calculateCharges(Order o);
	public int saveOrder(Order o);
	public void display();
	public Order findOrder(long oid);

}
