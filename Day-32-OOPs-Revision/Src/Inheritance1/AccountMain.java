package Src.Inheritance1;

public class AccountMain {
    
    public static void main(String[] args) {
        
        Account acc = new Account();
        acc.checkBalance();

        SavingAccount sacc = new SavingAccount();
        sacc.checkBalance();

        CurrentAccount cacc = new CurrentAccount();
        cacc.checkBalance();
    }
}
