package com.revised.clone1;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Address address = new Address("16th Main", "27th cross", "Banaglore");
		
		Employee emp1 = new Employee("Pradhum", "pradhum1234", address);
		
		Employee clonedEmp = (Employee) emp1.clone();
		
		emp1.address.city = "Hydrabad";
		
		System.out.println(clonedEmp.address.city);
		
		System.out.println(emp1.address.city);
	}

}
