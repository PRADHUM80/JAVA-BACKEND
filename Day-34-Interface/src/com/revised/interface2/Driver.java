package com.revised.interface2;

public class Driver 
{

	public static void main(String[] args) 
	{
		ISalary developer = new Developer();
        developer.displayRole();
        System.out.println("Salary: " + developer.calculateSalary(30000));

        ISalary tester = new Tester();
        tester.displayRole();
        System.out.println("Salary: " + tester.calculateSalary(25000));

        IManagerSalary manager = new Manager();
        manager.displayRole();

        double salary = manager.calculateSalary(50000);
        double allowance = manager.calculateAllowance(5000);

        System.out.println("Total salary: " + (salary + allowance));

	}

}
