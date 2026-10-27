package Src.Encapsulation1;

public class AccountMain {
    
    public static void main(String[] args) {
        
        Account acc = new Account("Pradhum ", 45550);

        acc.credit(50);
        System.out.println(acc.getBalance());
    }
}
