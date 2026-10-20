public class Employee 
{
    String empName;
	double basicSalary;
	
	public Employee(String empName, double basicSalary) 
	{
		this.empName = empName;
		this.basicSalary = basicSalary;
	}
	
	public double calculateSalary()
	{
		return basicSalary;
	}
	
}

class PermanentEmployee extends Employee
{

	public PermanentEmployee(String name, double salary) 
	{
		super(name, salary);
	
	}
	
	@Override
	public double calculateSalary()
	{
		return basicSalary + (basicSalary * 20 / 100);
	}
	
}

class ContractEmployee extends Employee
{

	public ContractEmployee(String name, double salary) 
	{
		super(name, salary);
		
	}
	
	@Override
	public double calculateSalary()
	{
		return basicSalary + (basicSalary * 10 / 100);
	}
	
}

class Manager extends Employee
{

	public Manager(String name, double salary) 
	{
		super(name, salary);
	}
	
	 @Override
	 public double calculateSalary()
	 {
	    return basicSalary + (basicSalary * 30 / 100);
	 }    
}
