package com.revised.interface2.MarkerType2;

//import java.lang.classfile.Superclass;

public class Account implements Cloneable // Allow To Copy..
{
	String name;
	String address;
	String accNo;
	
	public Account(String name, String address, String accNo)
	{
		super();
		this.name = name;
		this.address = address;
		this.accNo = accNo;
	}
	
//	Clonee..
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	
}
