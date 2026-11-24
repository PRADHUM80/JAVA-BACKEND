package com.revised.interface2.LambdaExp2;

public class Driver
{
	public static void main(String[] args) 
	{
		IAttendence atd = (name, roll, branch) ->
		{
			System.out.println("Attendence is Present.." + name + roll + branch);
			return "Attendence Done";
		};
		
		String res = atd.checkAttendence("Pradhum ", " cs-21-47" , " CSE");
	}
}
