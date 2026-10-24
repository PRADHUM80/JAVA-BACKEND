public class OnlinePaymentSystem {
    
    public static void main(String[] args) {
        
        Payment payment[] = {new Payment(), new CreditCardPayment(), new NetBankingPayment(), new UPIPayment()};

        for(Payment p : payment)
        {
            // RunTime Polymorphism..
            p.makePayment(500);

            // DownCasting.
            if(p instanceof CreditCardPayment)
            {
                CreditCardPayment credit = new CreditCardPayment();
                credit.cashBack();
            } else if (p instanceof NetBankingPayment)
            {
                NetBankingPayment net = new NetBankingPayment();
                net.generateTransactionId();
            } else if(p instanceof UPIPayment)
            {
                UPIPayment upi = new UPIPayment();
                upi.generateUPIId();
            }
            else
            {
                System.out.println(" ");
            }
        }
    }
}
