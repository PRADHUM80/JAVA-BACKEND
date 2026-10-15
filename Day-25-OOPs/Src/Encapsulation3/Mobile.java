package Src.Encapsulation3;

public class Mobile
{
    
    private double balance = 100;

    public void  recharge(double amount)
    {

        if(amount > 0)
        {
            balance = balance + amount;
              System.out.println("Recharge SuccessFully !!!!!");
        }

        else{
            System.out.println("Invailed Recharge !!!!!!!");
        }

      
    }

    public double getRecharge()
    {
        return  balance;
    }
}
