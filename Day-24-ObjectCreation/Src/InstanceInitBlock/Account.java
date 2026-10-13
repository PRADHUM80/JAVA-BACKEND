package Src.InstanceInitBlock;

public class Account
{
    // Static Init Block is Print...
    static 
    {
        System.out.println("Account SBI : ");
    } 

    String accountNumber;

    //	Instance Init Block -- > This will get executed Whenever Object is Created.

    {
        System.out.println("Account IIB : ");
    }

    public Account(String accountNumber)
    {
        super(); // FirstLine.
        //		Call to init block --> IIB --> 2nd Line.
        //		Like How many Objects are Created Then Print Same Many Times Instance Init Block..

        System.out.println("Account.Account(String accountNumber)..... ");
    }
}
