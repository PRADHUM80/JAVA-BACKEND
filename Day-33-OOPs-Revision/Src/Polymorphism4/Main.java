public class Main {
    
    public static void main(String[] args) {
        
        Process pro = new Process();
		
        pro.notificationProcess(new Email());

        pro.notificationProcess(new Facebook());

        pro.notificationProcess(new PhonePay());
    }
}
