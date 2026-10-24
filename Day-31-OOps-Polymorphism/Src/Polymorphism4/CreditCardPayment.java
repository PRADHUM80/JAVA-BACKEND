public class CreditCardPayment extends  Payment
{
    @Override 
    
    public void makePayment(double amount)
    {
        System.out.println("CreditCardPayment : 5000.0");
    }  
    
    public void cashBack()
    {
        System.out.println("CashBack is : 9000");
    }
}
