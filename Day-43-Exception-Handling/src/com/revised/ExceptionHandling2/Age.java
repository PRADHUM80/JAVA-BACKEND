package com.revised.ExceptionHandling2;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:-");
		String age = sc.nextLine();
		
		try
		{
			
			int ag = Integer.parseInt(age);
			System.out.println("age is number form..");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Pls Enter a Valid Age..");
			e.printStackTrace();
		}

	}

}
