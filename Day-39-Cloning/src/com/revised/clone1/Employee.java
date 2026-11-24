package com.revised.clone1;

public class Employee implements Cloneable
// Level - 1
{
	String name;
	String empCode;
	Address address; // HAS - A
	public Employee(String name, String empCode, Address address) 
	{
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Employee e =(Employee) super.clone();
		e.address = (Address) address.clone();
		return e; 
	}
}
