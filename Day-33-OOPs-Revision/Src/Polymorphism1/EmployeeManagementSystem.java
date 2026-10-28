public class EmployeeManagementSystem {
    public void work()
	{
		System.out.println("Employee is Working..");
	}
}

class Developer extends EmployeeManagementSystem
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

class Manager extends  EmployeeManagementSystem
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