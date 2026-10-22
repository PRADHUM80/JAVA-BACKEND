

class BankAccount
{
    public void calculateInterestRate()
    {
        System.out.println("Calculating BAnk Interest..");
    }
}

class SavingAccount extends BankAccount
{
    @Override
    public void calculateInterestRate()
    {
        System.out.println("SavingAccount InterestRate : 4%");
    }
}

class CurrentAccount extends BankAccount
{
    @Override 
    public void calculateInterestRate()
    {
        System.out.println("Current Account InterestRate : 0%");
    }
}


public class BankingSystem 
{
    public static void main(String[] args) {
        
        BankAccount acc1 = new SavingAccount(); // --> Upcatsing
        acc1.calculateInterestRate();

        BankAccount acc2 = new CurrentAccount(); // --> Upcasting..
        acc2.calculateInterestRate();
    }    
}
