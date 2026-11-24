package com.revised.ExceptionHandling2;

import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args)
	{
		
		Scanner sc = null;
		
		try
		{
			sc = new Scanner("order.txt");
			if(sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			else
			{
				System.out.println("Order File is Empty..");
			}
		}
//		catch(FileNotFoundException e)
//		{
//	        System.out.println("Could not open order.txt");
//	        e.printStackTrace();
//		}
		finally
		{
			if(sc != null)
			{
				sc.close();
			}
			System.out.println("File Operation is Completed.");
		}

	}

}
