/**
 * DebitCardPayment
 */
public class DebitCardPayment extends Payment
{
    @Override 
    public void doPayment()
    {
        System.out.println("Payment is Sucessfull!!. : 5000 --> DebitCardPaymet..");
    }   
    
}