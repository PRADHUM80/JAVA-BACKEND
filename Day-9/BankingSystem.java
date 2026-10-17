class BankingSystem
{
	//Deposit Methods...
	
	static double deposit(double balance, double amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			System.out.println("Deposit Successful");
		}
		else
		{
			System.out.println("Invailed Deposit Amount");
		}
		
		return balance;
	}
	
	// Withdraw Methods..
	static double withdraw(double balance, double amount)
	{
		if(amount <= 0)
		{
			System.out.println("Invalid Withdrawal Amount");
		}
		else if(amount > balance)
		{
			System.out.println("Insufficent balance");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Withdraw Successful");
		}
		
		return balance;
		
	}
	
	static void displayBalance(double balance)
	{
		System.out.println("Final Balance : " + balance);
	}
	
	public static void main(String args[])
	{
		double balance = 5000;
		
		balance = deposit(balance, 2000);
		
		balance = withdraw(balance, 1500);
		
		displayBalance(balance);
	}
	
	
	
	
}