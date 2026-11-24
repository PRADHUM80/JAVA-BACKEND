package com.revised.Exception1;

public class NullPointer {

	public static void main(String[] args) 
	{
		String name = null;
		
		System.out.println(name.length());
//		Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "name" is null

	}

}
