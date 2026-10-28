public class BankAccountMain {
    public static void main(String[] args) {
        
        //Upcasting..
		BankAccount acc1  = new SavingAccount();
//		acc1 Check --> calculateInterest() is exist a BankAccount or (--> Not..then compile Error..)...
//		then Execute Output is Object (new Saving Account....)...
		acc1.calculateInterest();
		
		BankAccount acc2 = new CurrentAccount();
		acc2.calculateInterest();
		
//		DownCasting 
	
//		SavingAccount sacc = (SavingAccount) new BankAccount(); // Explicit cast for write down casting...
//		sacc.calculateInterest();// ERROR..
		
//		SavingAccount sacc = (SavingAccount) acc1;
//		sacc.calculateInterest();

    }
}
