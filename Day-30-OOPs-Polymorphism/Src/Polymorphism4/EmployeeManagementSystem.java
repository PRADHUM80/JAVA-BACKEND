
class Employee
{
    public void work()
    {
        System.out.println("Employee is Working..");
    }
}

class Developer extends  Employee
{
    @Override 
    public void work()
    {
        System.out.println("Developer is Develop the Code..");
    }

    public void writeCode()
	{
		System.out.println("Developer is developing Spring Boot Application");
	}
}


class Manager extends  Employee
{
    @Override 
    public void work()
    {
        System.out.println("Manager is Working..");
    }

    public void conductMeeting()
    {
        System.out.println("Manager is Conducting a Meeting..");
    }
}

class EmployeeManagementSystem
{
    public static void main(String[] args) {
        
        // Upcasting...

        Employee emp1 = new Developer();
        emp1.work();

        // DownCasting.
        Developer d = (Developer) emp1;
        d.writeCode();
        

        // Upcasting..
        Employee emp2 = new Manager();
        emp2.work();

        // Downcasting..
        Manager m = (Manager) emp2;
        m.conductMeeting();
    }
}