package Src.Encapsulation4;

public class FundTransfer 
{
    
    private  String accoumtHolderName;
    private  String accountNumber;
    private double balance;

    public FundTransfer(String accoumtHolderName, String accountNumber, double balance )
    {
        this.accoumtHolderName = accoumtHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void transfer(double amount)
    {
        if(amount > 0 || balance > amount)
        {

            balance = balance - amount;
            System.out.println("Remainig Balance  : " + balance);
            System.out.println(accoumtHolderName);
            System.out.println(accountNumber);
        }

        else{
            System.out.println("insufficent Balance");
        }
    }

    public double getBalance()
    {
        return  balance;
    }
}
