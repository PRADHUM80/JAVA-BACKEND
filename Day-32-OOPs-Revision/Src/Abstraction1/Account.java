package Src.Abstraction1;

public class Account 
{
    /** 					..Abstraction..
	 * 1. Hide The Implementation and Show Only Essential Data..
	 * 2. hide Implementation  --> Private . (Core Functionalities)
	 * 3. Show Essential --> Public .(Expose the Out Side Of The Class).
	 * 
	 * 4. Real Life Example --> 
	 * 5. TV Remote 
	 * 6. When u drive a Car u Only get Access To The Starring, Accelerator, Broke (public Methods..)
	 * 7. 
	 * u Don't have direct Access to the fuel Injector, SparkPlug or Engine pistons (Private Methods..)
	 * 
	 * 8. ATM Withdraw -- > 
	 * 
	 */
    
    //	String name;
//	int balance;
//	
////	Constructor..
//	public Account(String name, int balance) 
//	{
//		super();
//		this.name = name;
//		this.balance = balance;
//	}

//	Expose The Core Functionalities.
	public void doSomeThing()
	{
		pin();
		checkBalance();
	}
	
//	Core Functionalities. Hide Details They cannot modify Directly..
	private boolean pin()
	{
		System.out.println("Pin is Correct..");
		return true;
	}
	
//	Core Functionalities.  Hide Details They cannot modify Directly..
	private int checkBalance()
	{
		System.out.println("balance is : " );
		return 543;
	}
}
