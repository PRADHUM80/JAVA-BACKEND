package com.revised.interface2.LambdaExp1;

public class Drive {

	public static void main(String[] args)
	{
		IAccount account = (name, add, pin) -> 	
		{
			System.out.println("Open Account .. For " + name);
			return "Account Opened";
		};
		
		String result = account.openAccount("Pradhum", "BTM", 5434);
	}

}
