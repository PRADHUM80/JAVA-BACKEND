package com.revised.ArrayList1;

import java.util.ArrayList;

public class StudentRegistration {

	public static void main(String[] args) 
	{
//		Create ArrayList --> String
		ArrayList<String> std = new ArrayList<String>();
		
//		Add Name-->
		std.add("Sahwaj");
		std.add("shawaj");
		std.add(null);
		std.add("Pradhum");
		std.add("Pradhum");
		std.add("Pradhum");
		std.add("Pradhum");
		std.add("Pradhum");
		std.add(null);
		std.add(null);
		
//		Print
		System.out.println(std);
		
//		output--> [Sahwaj, shawaj, null, Pradhum, Pradhum, Pradhum, Pradhum, Pradhum, null, null]
		
	}

}
