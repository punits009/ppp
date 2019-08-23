package com.cg.bean;

public class Order {
	private long id;
	private double price;
	private int quantity;
	private double amount;
	private double charges;
	public Order() {
		// TODO Auto-generated constructor stub
	}
	public Order(long id, double price, int quantity) {
		super();
		this.id = id;
		this.price = price;
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", price=" + price + ", quantity=" + quantity + ", amount=" + amount + ", charges="
				+ charges + "]";
	}
	
	

}
