public class Payment 
{
    
    // public int balance; // Any class Can Modify this data.  so i m using Private
    private  int balance;

    // Constructor
    public Payment(int balance)
    {
        this.balance = balance;
    }

    // Setter
    public void doCredit(int amount)
    {
        if(amount > 0)
        {
            // modifying the data
            balance  = balance + amount;
        }
    }

    public void doDebit(int amount)
    {
        // modifying the data
        balance = balance - amount;
    }

    // getter
    public int getBalance()
    {
        return balance;
    }
}
