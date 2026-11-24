package com.revised.collection1;
/**
 * Collections -->  
 * Store the Data.
 * Process The Data.
 * Store .
 * 
 */
public class Driver {

	public static void main(String[] args) 
	{
//		1. Stroe The Price ---> Container(Box) . Which Holds Integer Value..
//		Data Store in Array...
		int price[] = {200, 5400, 600, 8000, 6600, 8787, 9000,200, 400, 500}; //		Memory --> Heap --> Store to DataBase(JDBC).
		
//		2. Process --> Find The Price Value Above 5000.
//		price.length --> length of the array of price..
		for(int i = 0; i < price.length; i++)
		{
			int currentPrice = price[i];
			
			if(currentPrice > 5000)
			{
				System.out.println("Price's are above 5000 : " + currentPrice);
			}
		}
	}

}
