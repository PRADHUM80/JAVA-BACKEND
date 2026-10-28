public class Mobile {
    
    public void phone()
	{
		System.out.println("This Phone is Costly");
	}
}

class Iphone extends Mobile
{
	@Override
	public void phone()
	{
		System.out.println("This Phone is Costly --> Iphone18");
	}
}

class Samsung extends Mobile
{
	@Override
	public void phone()
	{
		System.out.println("This Phone is Costly --> Samsung");
	}

}
