public class BankAccount {
    
   private String accountHolder;
  private  double balance;

//   Parameterized Constructor..

public  BankAccount(String accountHolder, double balance)
{
    this.accountHolder = accountHolder;

    if(balance > 0)
    {
        this.balance = balance;
    }
    else
    {
        this.balance = 0;
    }
}

public void deposit(double amount)
{
    if(amount > 0)
    {
        balance = balance + amount;
        System.out.println("Deposit Successfully..." + amount);
    }
    else
    {
        System.out.println("Invailed Amount..");
    }
}

public  void display()
{
    System.out.println("Account Holder Name : " + accountHolder);
    
    System.out.println("Balance : " + balance);

}

public static void main(String[] args) {
    BankAccount acc = new BankAccount("Pradhum", 7900.0);
    acc.deposit(2000);
    acc.display();
}


}
