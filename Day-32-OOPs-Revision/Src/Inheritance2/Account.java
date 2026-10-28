package Src.Inheritance2;

public class Account {
    
    public  void checkAccBalance()
    {
        System.out.println("Account Balance is - 98765432");
    }

    public void checkDetails()
    {
        System.out.println("Details was Verified");
    }
}

class SavingAccount extends Account
{
    public void checkName()
    {
        System.out.println("AccountHolder Name was Correct..");
    }
}