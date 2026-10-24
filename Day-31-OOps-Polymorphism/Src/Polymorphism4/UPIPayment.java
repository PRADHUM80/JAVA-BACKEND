public class UPIPayment extends  Payment
{
    @Override 
    
    public void makePayment(double amount)
    {
        System.out.println("UPIPayment : 5000.0");
    } 
    
    public void generateUPIId()
    {
        System.out.println("UPI Id : Pradhum@pz");
    }
}
