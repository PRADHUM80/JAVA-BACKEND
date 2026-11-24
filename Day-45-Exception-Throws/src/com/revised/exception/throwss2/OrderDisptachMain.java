package com.revised.exception.throwss2;

public class OrderDisptachMain {

	public static void main(String[] args) 
	{
		OrderDispatch order = new OrderDispatch();
		    order.placeOrder("ORD-101");
	        order.placeOrder(null);
	        order.placeOrder("101");
	        order.placeOrder("ORD-");

	}

}
