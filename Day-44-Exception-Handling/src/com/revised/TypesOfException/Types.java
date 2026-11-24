package com.revised.TypesOfException;

public class Types {

	public static void main(String[] args)
	{
//		String name =  null;
//		System.out.println(name.length()); // NullPointerException .. without error Showing.. RunTimeException.
		
		String className = "com.revised.TypesOfException.Types";  //Typesss-get error,  End Mein Class Name  Same  Hona Chhaiyaa
		
		try
		{
//			Class is Inside The CLASS  and forNAme --> MEthods..
			Class.forName(className); // Loading the Class into Memory..
			System.out.println("class loaded..");
		}
		
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}

}
