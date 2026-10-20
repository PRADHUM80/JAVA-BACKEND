public class Bank 
{
    public double getInterestRate()
    {
        System.out.println("Bank. getInterestRate()....");
        return  5.5;
    }    
}

class SBI extends Bank
{
	@Override
	public double getInterestRate()
	{
		return 6.5;
	}
}

class HDFC extends Bank
{
	@Override
	public double getInterestRate()
	{
		return 7.0;
	}
}

class ICIC extends Bank
{
	@Override
	public double getInterestRate()
	{
		return 6.0;
	}
}

