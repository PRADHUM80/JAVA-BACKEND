class Employee
{
	public static void main(String args[])
	{
		String empName = args[0];
		int empId = Integer.parseInt(args[1]);
		int empSalary = Integer.parseInt(args[2]);
		String empLocation = args[3];
		
		System.out.println("Employee Name : " + empName);
		System.out.println("Employee Id :" + empId);
		System.out.println("Employee Salary : " + empSalary);
		System.out.println("Employee Location : " + empLocation);
		
	}


}