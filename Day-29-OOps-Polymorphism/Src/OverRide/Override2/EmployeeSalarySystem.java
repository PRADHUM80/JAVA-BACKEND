public class EmployeeSalarySystem {
    
    public static void main(String[] args) 
	{
	
		Employee e1 = new Employee("Pradhum", 30000);
		
		Employee e2 = new Employee("Amit", 30000);
		
		Employee e3 = new Employee("Shawaj Ansari", 30000);
		
		 System.out.println("Name: " + e1.empName);
	     System.out.println("Salary: " + e1.calculateSalary());

	        System.out.println("------------------");

	     System.out.println("Name: " + e2.empName);
	     System.out.println("Salary: " + e2.calculateSalary());

	        System.out.println("------------------");

	     System.out.println("Name: " + e3.empName);
	     System.out.println("Salary: " + e3.calculateSalary());
		
		
		
//		Create Array..
//		Employee employee[] = {e1, e2, e3};
//		
//		for(Employee emp : employee)
//		{
//			System.out.println(emp.empName + " Salary : " + emp.calculateSalary());
//		}

	}
}
