package com.revised.interface3;

public class PrimimumShopping implements IMemberDiscount
{
	 @Override
	    public double calculateFinalPrice(double amount, int rate) 
	    {
	        return amount - (amount * rate / 100);
	    }

	    @Override
	    public void displayCategory() 
	    {
	        System.out.println("Category: Premium Shopping");
	    }

	    @Override
	    public double applyCoupon(double price, double couponAmount) 
	    {
	        return Math.max(0, price - couponAmount);
	    }
}
