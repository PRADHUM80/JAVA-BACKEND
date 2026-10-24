/**
 * PaymentSystemMain
 */
public class PaymentSystemMain {

    public static void main(String[] args) {
        
        PaymentProcess paymentProcess = new PaymentProcess();

        // user1
        NetBankingPayment netBank = new NetBankingPayment();
        paymentProcess.processPayment(netBank);

        // user2
        CreditCardPayment credit = new CreditCardPayment();
        paymentProcess.processPayment(credit);

        // user3
        DebitCardPayment debit = new DebitCardPayment();
        paymentProcess.processPayment(debit);
    }
}