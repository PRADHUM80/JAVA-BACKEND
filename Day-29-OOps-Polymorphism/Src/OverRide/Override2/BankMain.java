public class BankMain {
    
    public static void main(String[] args) {
        
        Bank b1 = new SBI();

        Bank b2 = new HDFC();

        Bank b3 = new ICIC();

        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
		
		System.out.println("HDFC Interset Rate: " + b2.getInterestRate() + "%");
		
		System.out.println("ICIC Interset Rate: " + b3.getInterestRate() + "%");
		
    }
}
