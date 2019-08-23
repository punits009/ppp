package com.cg.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.jupiter.api.Test;

import com.cg.bean.Order;
import com.cg.dao.OrderRepoImpl;
import com.cg.service.OrderServiceImpl;

class ImportedOrderTest {

	OrderRepoImpl dao=new OrderRepoImpl();
	OrderServiceImpl ser=new OrderServiceImpl();
	@Test
	void testcalculateOrder() {
		Order o=new Order(101,5,4);
		assertEquals(1500,ser.calculateOrder(o)*75);
		
	}
	@Test
	void testcalculateCharges() {
		Order o=new Order(101,5,4);
		assertEquals(4.6875,ser.calculateCharges(o)*75);
		
	}
	
	@Test
	void testfindOrder() {
		Order o=new Order(101,5,4);
		Map<Long,Order> ac=new TreeMap<>();
		ac.put((long) 101, o);
		long a=101;
		assertEquals(o,ac.get(a));
		
	}

}
