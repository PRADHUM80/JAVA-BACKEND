package com.revised.polymorphsim3;


class Employee
{
	public void work()
	{
		System.out.println("Employee is Working..");
	}
}

class Developer extends Employee
{
	@Override
	public void work()
	{
		System.out.println("Developer is writting java Code : - >");
	}
	
	public void writeCode()
	{
		System.out.println("Developer is developing Spring Boot Application");
	}
}


class Manager extends Employee
{
	@Override
	public void work()
	{
		System.out.println("Manager is managing the team");
	}
	
	public void conductMeeting()
	{
		System.out.println("Manager is conducting team meeting");
	}
}



public class EmployeeManagementSystem {

	public static void main(String[] args) 
	{
		
//		Upcasting..
		Employee e1 = new Developer();
		e1.work();
//		DownCasting...
		Developer d =  (Developer) e1;
		d.writeCode();
		
//		Upcasting..
		Employee e2 = new Manager();
		e2.work();
//		DownCasting..
		Manager m = (Manager) e2;
		m.conductMeeting();

	}

}
