public class Laptop
{
	public void company()
	{
		System.out.println("This Laptop is ---> ");
	}
}

class Dell extends Laptop
{
	@Override
	
	public void company()
	{
		System.out.println("This Laptop is ---> Dell");
	}
	
}

class Hp extends Laptop
{
	@Override
	public void company()
	{
		System.out.println("This Laptop is ---> Hp");
	}
}
