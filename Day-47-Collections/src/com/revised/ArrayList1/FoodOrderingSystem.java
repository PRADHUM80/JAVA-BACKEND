package com.revised.ArrayList1;

import java.util.ArrayList;

public class FoodOrderingSystem {

	public static void main(String[] args) 
	{
//		Create an ArrayList of food items.
		ArrayList<String> food = new ArrayList<String>();
//		Add Pizza, Burger, Biryani and Pasta.
		food.add("Pizza");
		food.add("Burger");
		food.add("Briyani");
		food.add("Pasta");
		food.add(null);
		food.add("Pizza");
//		print Food
		System.out.println(food);
		
	}

}
