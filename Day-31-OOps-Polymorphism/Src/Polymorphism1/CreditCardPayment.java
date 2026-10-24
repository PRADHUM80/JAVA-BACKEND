/**
 * CreditCardPayment
 */
public class CreditCardPayment extends Payment
{
    @Override 
    public void doPayment()
    {
        System.out.println("Payment is Sucessfull!!. : 5000 --> CreditCard..");
    }   
    
}