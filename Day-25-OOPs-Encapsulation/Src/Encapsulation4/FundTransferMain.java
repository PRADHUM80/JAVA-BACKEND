package Src.Encapsulation4;

public class FundTransferMain {
    
    public static void main(String[] args) {
        
        FundTransfer transfer = new FundTransfer("Pradhum", "SBIN00786", 5000.0);

        transfer.transfer(3000);

        System.out.println(transfer.getBalance());
    }
}
