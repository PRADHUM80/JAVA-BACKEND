package com.revised.Exception.Handling1;

public class Drive 
{

	public static void main(String[] args)
	{
		System.out.println("Drive.Main() --> Start");

		Drive dr = new Drive();
		dr.doSomeThing();
		System.out.println("Drive.Main() --> End");
		
	}

	public void doSomeThing()
	{
		System.out.println("Drive doSomeThing() --> Start");
		String name = null;
		int amount = 100;
		try
		{
//			Risk Code --> Code Which may Throw an Exception...
			amount = amount / 0;
			System.out.println(name.length()); // NPE --> Not Handle...
			System.out.println("After Length().."); // Igonred..
		}
		
//		Catch Block is Multiple Times..
		catch (NullPointerException e)  // This can Catch Exception Object and its child Object..
		{
			System.out.println("Name is Null ...");
			e.printStackTrace(); //- prints the exception details and method calls to the error output, usually visible in your console.
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("amount can not be / be Zero ");
			e.printStackTrace();
		}
		System.out.println("Drive.doSomeThing() END");
	}
}
