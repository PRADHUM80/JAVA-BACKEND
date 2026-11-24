package com.revised.ArrayList1;

import java.util.ArrayList;

public class EmployeeManagementSystem {

	public static void main(String[] args) 
	{
//		Create an ArrayList.
		ArrayList<String> emp = new ArrayList<String>();
		
//		Add 6 employee names.Add duplicate names.
		emp.add("Pradhum");
		emp.add("Akash");
		emp.add("Neplai");
		emp.add(null);
		emp.add(null);
		emp.add("Pradhum");
		emp.add("Akash");
		emp.add("Neplai");
		
//		Print the total number of employees using size().
		System.out.println(emp);
//		Size()
		System.out.println("Size of Employee : " + emp.size());
		
//		get()
		System.out.println("Index of : -> " + emp.get(5));  //Pradhum
		
//		remove()
		System.out.println("Remove of  : -> " + emp.remove(7)); //Neplai
		System.out.println(emp);
		
	}

}
