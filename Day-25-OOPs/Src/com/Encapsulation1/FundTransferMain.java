public class FundTransferMain {
    
    public static void main(String[] args) {
        
        FundTransfer fund = new FundTransfer("Pradhum Kumar", "8089080800", 30000);
        System.out.println(fund.getAccountHolderName());
        System.out.println(fund.getAccountNumber());
        System.out.println(fund.getAccountBalance());

        fund.transferFund(5000);
    }
}
