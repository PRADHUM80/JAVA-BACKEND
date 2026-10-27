package Src.Encapsulation2;

public class Employee 
{
    
    private String empId;
	private String name;
	private double salary;
	
	public Employee(String empId, String name, double salary) 
	{
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public void increaseSalary(double amount)
	{
		if(amount > 0)
		{
			System.out.println("Salary is Positive.");
            salary = salary + amount;
		}
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
