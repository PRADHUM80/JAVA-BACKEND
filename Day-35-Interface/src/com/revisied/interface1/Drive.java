package com.revisied.interface1;

public class Drive {

	public static void main(String[] args)
	{
		
		IBooking book = new TrainBooking();
		book.autoUpgrade();

	}

}
