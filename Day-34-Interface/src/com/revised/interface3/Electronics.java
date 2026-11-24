package com.revised.interface3;

public class Electronics implements IShoppingDiscount
{
	@Override
    public double calculateFinalPrice(double amount, int rate) 
	{
        return amount - (amount * rate / 100);
    }

    @Override
    public void displayCategory() 
    {
        System.out.println("Category: Electronics");
    }
}
