package com.cg.service;

import com.cg.bean.Order;
import com.cg.dao.OrderRepo;
import com.cg.dao.OrderRepoImpl;

public class OrderServiceImpl implements OrderService{

	OrderRepo dao=new OrderRepoImpl();
	@Override
	public int calculateOrder(Order o) {
		// TODO Auto-generated method stub
		double amount=0.0;
		amount=o.getQuantity()*o.getPrice();
		o.setAmount(amount);
		return (int)amount;
	}

	@Override
	public int saveOrder(Order o) {
		// TODO Auto-generated method stub
		dao.saveOrder(o);
		return 1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		dao.display();
	}

	@Override
	public double calculateCharges(Order o) {
		// TODO Auto-generated method stub
		double amount=0.0;
		amount=o.getPrice()*0.0125;
		o.setCharges(amount);
		return amount;
	}

	@Override
	public Order findOrder(long oid) {
		// TODO Auto-generated method stub
		Order a=dao.findOrder(oid);
		return a;
	}
	

}
