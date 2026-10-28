
class Delivery extends Object
{
    public void doDeliver()
	{
		System.out.println("Delivery ... doDeliver()...");
	}
}

class ExpressBee extends Delivery
{
	@Override
	public void doDeliver()
	{
		System.out.println("ExpressBee ... doDeliver()...");
	}
}

class Ekart extends Delivery
{
	@Override
	public void doDeliver()
	{
		System.out.println("Ekart ... doDeliver()...");
	}
}

