public class NetBankingPayment extends Payment
{
    @Override 
    
    public void makePayment(double amount)
    {
        System.out.println("NetBankinPayment : 5000.0");
    }
    
    public void generateTransactionId()
    {
        System.out.println("Transaction id : TXN1234");
    }
}
