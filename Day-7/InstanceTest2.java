class InstanceTest2
{
	double balance = 5000.0;
	
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Balance is : " + balance);
	}
	
	public static void main(String args[])
	{
		InstanceTest2 i = new InstanceTest2();
		
		// Here i is a Refrence of Instance Class.
		
		i.deposit(2000.0); // Method name Calling ....
		
		//System.out.println(i.balance);
		//System.out.println(i.amount);
	}
}