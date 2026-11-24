package com.revised.interface3;

public interface IShoppingDiscount 
{
	int MAX_DISCOUNT_PERCENT = 100;

    double calculateFinalPrice(double amount, int rate);

    void displayCategory();
}
