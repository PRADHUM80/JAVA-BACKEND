package MultiLevel;


class Account
{
    public void openBankAccount()
    {
        System.out.println("Parent Class .. ");
    }
}

class SavingAccount extends Account
{
    public void openBankAccount()
    {
        System.out.println("Saving Account OR Single Inheritance......");
    }
}


class CurrentAccount extends SavingAccount
{
    public void  openBankAccount()
    {
        System.out.println("Current Account :  OR Multilevel");
    }
}


public class MultiLevel {
    
    public static void main(String[] args) {
        
        CurrentAccount cacc = new CurrentAccount();
        cacc.openBankAccount();
    }
}
