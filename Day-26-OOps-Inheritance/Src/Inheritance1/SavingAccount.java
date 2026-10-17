


public class SavingAccount extends Account{
    

    public SavingAccount()
    {
        super();
    }

    // Methods 
    public void openBankAccount(String address, String type)
    {

        super.openBankAccount("Pradhum Kumar", "SBI0987654321");
        // openBankAccount(name, accNo);

        System.out.println("Saving Account ().... " + "Address : " + address + " " + "Type : " + type);

    }
}
