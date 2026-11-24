package com.revised.interface3;

public class Driver 
{

	public static void main(String[] args) 
	{
		IShoppingDiscount electronics = new Electronics();
        electronics.displayCategory();
        System.out.println(
            "Final price: " + electronics.calculateFinalPrice(20000, 10)
        );

        IShoppingDiscount clothing = new Clothing();
        clothing.displayCategory();
        System.out.println(
            "Final price: " + clothing.calculateFinalPrice(3000, 20)
        );

        IMemberDiscount premium = new PrimimumShopping();
        premium.displayCategory();

        double price = premium.calculateFinalPrice(5000, 10);
        double finalPrice = premium.applyCoupon(price, 500);
        
        System.out.println("Price after coupon: " + finalPrice);

	}

}
