package com.revised.interface2;

public interface ISalary 
{
	int BONUS_PERCENT = 10; // public static final.
	
	double calculateSalary(double basicSalary);
	
	void displayRole();
}
