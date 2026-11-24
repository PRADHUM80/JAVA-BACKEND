package com.revised.ExceptionHandling2;

import java.util.Scanner;

public class ProductSelection {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String products[] = {"Laptop", "Mobile", "Headphones"};
		
		System.out.println("Enetr product index( 0 to 2) : ");
		int index = sc.nextInt();
		
		try
		{
			System.out.println("Selected Products : " + products[index]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invailed product Index : ");
		}
		sc.close();

	}

}
