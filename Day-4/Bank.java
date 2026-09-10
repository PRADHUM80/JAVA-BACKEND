public class Bank 
{
    public static void main(String[] args)
    {
        String bankName = args[0];
        String branch = args[1];
        String ifscCode = args[2];
        String accountholderName = args[3];
        String country = args[4];

        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch: " + branch);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Account Holder Name: " + accountholderName);
        System.out.println("Country: " + country);
    }
    
}
