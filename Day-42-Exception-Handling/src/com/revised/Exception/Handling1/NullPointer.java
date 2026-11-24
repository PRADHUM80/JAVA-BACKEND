package com.revised.Exception.Handling1;

public class NullPointer {

	public static void main(String[] args) 
	{
	try
	{
		String name = null;
		
		System.out.println(name.length());
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
	}
	catch (NullPointerException e)
	{
		System.out.println("name is null..");
		e.printStackTrace(); //java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null
//	    at com.revised.Exception.Handling1.NullPointer.main(NullPointer.java:11)

	}
	}

}
