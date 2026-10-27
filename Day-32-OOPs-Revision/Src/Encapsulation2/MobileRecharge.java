package Src.Encapsulation2;

public class MobileRecharge {
    
    public static void main(String[] args) {
        
        Mobile m = new Mobile("0987654323456", 50);

        m.doRecharge(350);
        m.makeCall(50);

        System.out.println(m.getBalance());
    }
}
