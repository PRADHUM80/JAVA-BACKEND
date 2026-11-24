package com.revised.polymorphsim3;

class Payment
{
	public void makePayment(double amount)
	{
		System.out.println("Processing Payment: 5000.0");
	}
}


class UPIPayment extends Payment
{
	@Override
	public void makePayment(double amount)
	{
		System.out.println("UPI Payment Successful: 5000.0");
	}
	
	public void generateUPIId()
	{
		System.out.println("UPI ID: pradhum@upi");
	}
}

class CreditCardPayment extends Payment
{
	@Override
	public void makePayment(double amount)
	{
		System.out.println("Credit Card Payment Successful: 5000.0");
	}
	
	public void calculateCashBack(double amount)
	{
		System.out.println("5% cashback on the payment amount.");
	}
}

class NetBankingPayment extends Payment
{
	@Override
	public void makePayment(double amount)
	{
		System.out.println("Net Banking Payment Successful: 5000.0");
	}
	
	public void generateTransactionId()
	{
		System.out.println("Transaction ID: TXN12345");
	}
}


public class OnlinePaymentSystem {

	public static void main(String[] args) 
	{
//		Upcasting..
		
		Payment payment[] = {new UPIPayment(), new CreditCardPayment(), new NetBankingPayment()};
		
		for(Payment p : payment)
		{
//			Runtime Polymorphsim..
			p.makePayment(5000);
			
//			DownCasting ..
			if(p instanceof UPIPayment)
			{
				UPIPayment upi = (UPIPayment) p;
				upi.generateUPIId();
			}
			
			else if (p instanceof CreditCardPayment)
			{
				CreditCardPayment credit = (CreditCardPayment) p;
				credit.calculateCashBack(500);
			}
			else if(p instanceof NetBankingPayment)
			{
				NetBankingPayment net = (NetBankingPayment) p;
				net.generateTransactionId();
			}
			
			System.out.println();
		}

	}

}
