package Src.Inheritance1;

public class Account extends Object 
{
    public void checkBalance()
    {
        System.out.println("Account ... checkBalance()..");
    }
}

class SavingAccount extends  Account
{
    @Override 
    public void checkBalance()
    {
        System.out.println("Saving-Account ... checkBalance()..");
    }
}

class CurrentAccount extends Account
{
    @Override 
    public void checkBalance()
    {
        System.out.println("Current-Account ... checkBalance()..");
    }
}