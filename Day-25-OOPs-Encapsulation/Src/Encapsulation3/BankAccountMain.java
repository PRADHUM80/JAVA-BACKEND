package Src.Encapsulation3;

public class BankAccountMain {
    
    public static void main(String[] args) {
        
        BankAccount acc = new BankAccount();

        acc.WithDraw(3000);

        System.out.println(acc.getBalance());
    }
}
