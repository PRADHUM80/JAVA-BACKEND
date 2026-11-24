package com.revised.Exception2;

import java.util.Scanner;

public class OnlineShopping {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter the product Qunatity : ");
			String input = sc.nextLine();
			
			try
			{
				int quantity = Integer.parseInt(input);
				
				if(quantity > 0)
				{
					System.out.println("Quantity added: " + quantity);
                     break;
				}
				
				System.out.println("Quantity added Must be 1");
			}
			catch (NumberFormatException e) 
			{
				System.out.println("Pls Enter The Whole Number..");
			}
			sc.close();
		}

	}

}
