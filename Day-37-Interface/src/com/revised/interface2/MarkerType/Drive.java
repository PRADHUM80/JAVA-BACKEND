package com.revised.interface2.MarkerType;

public class Drive {

	public static void main(String[] args) 
	{
		IAccount account = (name, add, amt) ->
		{
			System.out.println(" Opening Account... for "+name);
			
			return "Account Opened";
		};
		
		String result = account.openAccount("Pradhum", "BTM Bangalore", 1000);
	}

}
