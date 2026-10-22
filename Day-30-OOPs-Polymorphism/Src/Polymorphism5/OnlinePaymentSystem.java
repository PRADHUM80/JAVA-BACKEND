
class Payment 
{
    public void makePayment(double amount)
    {
        System.out.println("Processing PAyment  : 5000");
    }
}

class UPIPayment extends Payment
{
    @Override 
    public void makePayment(double amount)
    {
        System.out.println("UPIPayment is Successfully : 5000.0");
    }

    public void generateUPI()
    {
        System.out.println("UPIID is Generated..");
    }
}

class CreditCardPayment extends Payment
{
    @Override 
    public void makePayment(double amount)
    {
        System.out.println("CreditCard Bill is : 9000.0");
    }

    public void calculateCashBack()
    {
        System.out.println("5% cashback on the Payment..");
    }
}

class NetBanking extends Payment
{
    @Override 
    public void makePayment(double amount)
    {
        System.out.println("NetBanking Payment is Successful : 90000");
    }
    
    public void generateTransactionID()
    {
        System.out.println("Transaction ID is Successfull ...");
    }
}

public class OnlinePaymentSystem 
{
    public static void main(String[] args) {
        
        // Payment p1 = new CreditCardPayment();
        Payment pay[] =  {new UPIPayment(), new CreditCardPayment(), new NetBanking()};

        for(Payment p : pay)
        {
            // Runtime : Polymorphism.
            p.makePayment(5000);

            // DownCasting..
            if(p instanceof UPIPayment)
            {
                UPIPayment upi = (UPIPayment) p;
                upi.generateUPI();
            } else if (p instanceof CreditCardPayment)
            {
                CreditCardPayment card = (CreditCardPayment) p;
                card.calculateCashBack();
            } else if(p instanceof NetBanking)
            {
                NetBanking net = (NetBanking) p;
                net.generateTransactionID();
            }

            else
            {
                System.err.println(" ");
            }
            
        }

    }    
}
