package com.revised.interface3;

public interface IMemberDiscount extends IShoppingDiscount
{
	double applyCoupon(double price, double couponAmount);
}
