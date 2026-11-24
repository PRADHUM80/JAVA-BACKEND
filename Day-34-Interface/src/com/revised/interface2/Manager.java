package com.revised.interface2;

public class Manager implements IManagerSalary
{

	@Override
	public double calculateSalary(double basicSalary) 
	{
        double bonus = basicSalary * BONUS_PERCENT / 100;
        return basicSalary + bonus;
	}

	@Override
	public void displayRole() 
	{
		System.out.println("Role: Manager");
		
	}

	@Override
	public double calculateAllowance(double allowance) 
	{
		 return allowance;
	}

}
