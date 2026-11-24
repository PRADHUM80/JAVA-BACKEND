package com.revised.ArrayList1;

import java.util.ArrayList;

public class ShoppingCart {

	public static void main(String[] args)
	{
//		Create an ArrayList of String.
		ArrayList<String> products = new ArrayList<String>();
		
//		Add multiple product names.
		products.add("Bottel");
		products.add("Chips");
		products.add("BedSheet");
		products.add(null);
		products.add("Bottel");
		products.add("Chips");
		products.add(null);
		products.add("BedSheet");
		
//		Print all products.
		System.out.println(products);
		
//		[Bottel, Chips, BedSheet, null, Bottel, Chips, null, BedSheet]
		/**
		 * Order maintain.
		 * Duplicate allowed.
		 * Multiple Null Value.
		 */
		
	}

}
