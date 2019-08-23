package com.cg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.cg.bean.Order;

public class OrderRepoImpl implements OrderRepo{

	Map<Long,Order> acc=new TreeMap<Long,Order>();
	@Override
	public int saveOrder(Order o) {
		// TODO Auto-generated method stub
		System.out.println(o);
		acc.put(o.getId(), o);
		return 1;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		Collection<Order> val=acc.values();
		ArrayList<Order> vallist=new ArrayList<>(val);
		Iterator it=vallist.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	@Override
	public Order findOrder(long oid) {
		// TODO Auto-generated method stub
		Order ob=acc.get(oid);
		return ob;
	}
}
