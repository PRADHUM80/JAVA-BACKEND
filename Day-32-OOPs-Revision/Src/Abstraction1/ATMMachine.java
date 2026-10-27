package Src.Abstraction1;

public class ATMMachine 
{
    //	Public method Expose The Out Side of The Class..
	public void doTransaction(int pin, double checkBalance)
	{
//		Show here
		pin(pin);
		checkBalance(checkBalance);
	}
	
	private boolean pin(int pin)
	{
		System.out.println("Correct pin");
		return true;
	}
	
	private double checkBalance(double checkBalance)
	{
		System.out.println("Balance is " + checkBalance);
		return 9800.0;
	}    
}
