public class BankAccount {
    
    public void calculateInterest()
	{
		System.out.println("Calculating Bank Interest ...");
	}

}


class SavingAccount extends BankAccount
{
	@Override
	public void calculateInterest()
	{
		System.out.println("Saving Account InterestRate : 4%");
	}
}

class CurrentAccount extends BankAccount
{
	@Override
	public void calculateInterest()
	{
		System.out.println("Current  Account IntersetRate : 0%");
	}
}
