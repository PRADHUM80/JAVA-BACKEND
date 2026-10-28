public class DeliveryMain {
    
    public static void main(String[] args) {
        
        DeliveryProcess deliveryProcess = new DeliveryProcess();
        deliveryProcess.proceeDelivery(new Ekart());

        deliveryProcess.proceeDelivery(new ExpressBee());
    }
}
