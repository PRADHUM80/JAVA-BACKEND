class Account
{
    // Public --> Using Exposed The Functionalities....
    public void openAccount(String name, String address ,String pan, String addhar,String photo, double balance)
    {
        vaildNameAndAddress(name, address);
        vaildPan(pan);
        vaildAddhar(addhar);
        vaildPhoto(photo);
        minimumBalance(balance);

    } 


    // Core Functionalities..
    private boolean vaildNameAndAddress(String name, String address)
    {
        System.out.println("OpenAccount.vaildNAmeAndAddress()......");
        return true;
    }

    // Core Functionalities..
    private boolean vaildPan(String pan)
    {
        System.out.println("OpenAccount. vaildPan()....");
        return true;
    }

    // Core Functionalities..
    private void minimumBalance(double balance)
    {
        System.out.println("OpenAccount. minimumBalance Maintain...");
    }

    // Core Functionalities...
    private boolean vaildPhoto(String pic)
    {
        System.out.println("OpenAcccount. VaildPhoto()...");
        return true;
    }

    private  boolean vaildAddhar(String addhar)
    {
        System.out.println("OpenAccount. ValidAddhar()...");
        return true;
    }
}