package Src.Abstraction1;

public class ATMMachineMain {
    
    public static void main(String[] args) {
        
        ATMMachine atm = new ATMMachine();
		
		atm.doTransaction(8765, 9800.0);
    }
}
