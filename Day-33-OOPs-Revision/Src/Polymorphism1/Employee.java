public class Employee {
    
    public void markIn()
	{
		System.out.println("EMployee.markIn().....Employee Markin in");
	}
}

class HRManager extends Employee
{
	@Override
	public void markIn()
	{
		System.out.println("HRManager.markIn()..... HRManager Markin in ");
	}

}
