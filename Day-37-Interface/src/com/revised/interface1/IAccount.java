package com.revised.interface1;


//@FunctionalInterface // Follow All The Rules...

// extends IACcountmgmt
public interface IAccount  extends IAccountMgmt // showing error --> @FunctionalInterface' annotation; IAccount is not a functional interface
{
	void openAccount(); // SAM--> Single Abstract Methods.. + one Abstract MEthods From IAccountMgmt. so error shoeing.
	
//	add 
	default void addBeni()
	{
		
	}
}
