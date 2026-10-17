

// Parent Class... OR Super-Class
class Account
{
    public  void  accountBalance(double balance)
    {
        System.out.println("Balance is : " + balance);
    }
}

// SavingAccount --> Child Class Or Sub-Class 
class SavingAccount extends  Account
{
    @Override  // Changing the Super Class Methods Functionalities...
    public  void accountBalance(double balance)
    {
        System.out.println("Balance is : " + balance);
    }
}

class SingleInheritannce
{

    public static void main(String[] args) {
        
        System.out.println("Single Inheritance.........");

        SavingAccount sacc = new SavingAccount();
        sacc.accountBalance(3000.00);
    }
}