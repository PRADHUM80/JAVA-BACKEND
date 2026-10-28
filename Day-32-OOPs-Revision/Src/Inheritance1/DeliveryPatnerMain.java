package Src.Inheritance1;

public class DeliveryPatnerMain {
    
    public static void main(String[] args) {
        
        DeliveryPatner del = new DeliveryPatner();
        del.doDelivery();

        Ekart e = new Ekart();
        e.doDelivery();

        XpressBee x = new XpressBee();
        x.doDelivery();
    }
}
