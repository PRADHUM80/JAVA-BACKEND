package com.revised.interface2.LambdaExp;

public class Drive {

	public static void main(String[] args) 
	{
		IAccount account = () ->
		{
			System.out.println("Open Account .....");
		};
		
		account.openAccount();

	}

}
