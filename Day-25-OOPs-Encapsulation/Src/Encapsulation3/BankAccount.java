package Src.Encapsulation3;

public class BankAccount
{
    private double balance = 5000.0;
    
    public void WithDraw(double amount)
    {

        if(amount > 0 && amount < balance)
        {
            balance = balance - amount;
            System.out.println("Congrats Withdraw is Successful !!!!!");
        }
        else{
            System.out.println("Invailed Balance Enter");
        }
    } 

            public double getBalance()
            {
                return  balance;
            }
}
