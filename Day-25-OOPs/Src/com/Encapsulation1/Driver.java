public class Driver {
    
    public static void main(String[] args) {
        
        Payment pay = new Payment(1000);

        pay.doCredit(200); 

        // pay.balance = 200000;

        // System.out.println(pay.balance); // Directly modfying the data at PAyment class..

        // so ucalling getters methods.

        System.out.println(pay.getBalance()); //1200

        pay.doDebit(300);
        System.out.println(pay.getBalance()); //900

        /*
        Here Data --> Private
        Methods  --> Public
        Methods Like Getters & Setters.
         */

        
    }
}
