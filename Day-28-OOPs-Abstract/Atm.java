public class Atm 
{
    // Public --> To Exposed The Functionality
    
    public void withdrawCash(String pin, double balance)
    {
        pin(pin);
        withdraw(0);
        checkBalance(balance);
        printRecepit(pin);
    }

    // Private --> Hide the Core Functionality...

    private boolean pin(String pin)
    {
        System.out.println("withdrawCash . pin()....." + pin);
        return  true;
    }

    // Core Functionality..
    private  boolean checkBalance(double balance)
    {
        System.out.println("withdrawCash. checkBalance()..." + balance);
        return  true;
    }

    // Core Functionality..
    private boolean withdraw(int amount)
    {
        System.out.println("withdrawCash . withdraw()...." + amount);
        return true;
    }

    // Core Functionality..
    private void printRecepit(String recept)
    {
        System.out.println("withdrawCash . printRecepit()... " + recept);
    }
}
