package Src.Encapsulation2;

public class Mobile 
{
    private String mobileNumber;
	private double balance;
	
	public Mobile(String mobileNumber, double balance) 
	{
		super();
		this.mobileNumber = mobileNumber;
		this.balance = balance;
	}
	
	public void doRecharge(double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Eneter a psoitive Amount.");
			return;
		}
		
		balance = balance + amount;
		System.out.println("Recharge sucessfull : " + amount +"  " + mobileNumber);
	}
	
	public void makeCall(int minutes)
	{
		if(minutes <= 0)
		{
			System.out.println("Enter positive Minutes . ");
			return;
		}
		
		double cost = minutes * 2;
		
		if(cost > balance)
		{
			System.out.println("Insufficent Balance");
		}
		
		balance = balance - cost;
		System.out.println("Call Successfully Cost Rs : " + cost);
	}
	
	    public double getBalance()
	    {
		    return balance;
            
	    }    

        public  String getNumber()
        {
            return "mobileNumber";
        }
}
