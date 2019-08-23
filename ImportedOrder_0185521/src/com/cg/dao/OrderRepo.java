package com.cg.dao;

import com.cg.bean.Order;

public interface OrderRepo {
	
	public int saveOrder(Order o);
	public void display();
	public Order findOrder(long oid);

}
