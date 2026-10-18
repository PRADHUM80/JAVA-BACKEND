public class FundTransfer {
    
    // Encapsulation 

    private String accHolderName;
    private String accNumber;
    private int balance;

    public FundTransfer(String accHolderName, String accNumber, int balance)
    {
        super();
        this.accHolderName = accHolderName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public void setAccountHolderName(String accHolderName)
    {
        this.accHolderName = accHolderName;
    }

    public String getAccountHolderName()
    {
        return  accHolderName;
    }

    public void setAccountNumber(String accNumber)
    {
        this.accNumber = accNumber;
    }
    public String getAccountNumber()
    {
        return accNumber;
    }

    public void  setAcountBalance(int balance)
    {
         this.balance = balance;
    }
    public int getAccountBalance()
    {
        return balance;
    }

    // Create a Methods..

    public void  transferFund(int amount)
    {
        if(amount > 0)
        {
            System.out.println("Amount must be Positive");
        }
        else if (balance > amount)
        {
            System.out.println("u can withdraw....");
            balance = balance - amount;
            System.out.println(balance);
        }
        else
        {
            System.out.println("Invailed Amount..");
        }
    }
}
