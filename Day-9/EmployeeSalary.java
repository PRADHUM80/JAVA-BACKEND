class EmployeeSalary
{
	double basicSalary = 30000;
	double bonus = 5000;
	
	// Non-static method to calculate salary
	double calculateSalary()
	{
		return basicSalary + bonus;
	}
	
	// Non-static method to display details
    void displayDetails() 
	{
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
	
	public static void main(String args[])
	{
		//Creating an Object..
		EmployeeSalary emp = new EmployeeSalary();
		
		 // Calling the non-static method
        emp.displayDetails();
	}
}
	
		