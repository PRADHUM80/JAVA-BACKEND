package com.revised.Exception2;

import java.util.Scanner;

public class ResturantBill {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Total Bill ..");
		int totalBill = sc.nextInt();
		
		System.out.println("Enter total Friends .." );
		int totalFriends = sc.nextInt();
		
		try
		{
			int share = totalBill / totalFriends;
			System.out.println("Share your bill in each friends ..  " + share);
		}
//		you enter 0 friends, bill / friends throws an exception and Java runs the catch block.
		catch(ArithmeticException e)
		{
			System.out.println("Number of Friends Cannot be Zero.. ");
		}
		
		sc.close();

	}

}
