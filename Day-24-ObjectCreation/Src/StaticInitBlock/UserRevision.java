package Src.StaticInitBlock;

 class User {
    
    String userName;
    String userId;
    String mobileNumber;

    // Static Block Created --> when Static extecuted Class Loading .. Exectue onle Once...
    static 
    {
        System.out.println("i am in Static Init Block...");
    }

    public  User(String userName, String userId, String mobileNumber)
    {
        super(); // Either Supr Or This .. But Super is Default.....
        this.userName = userName;
        this.userId = userId;
        this.mobileNumber = mobileNumber;
    }
}

/**
 * UserRevision
 */
public class UserRevision
{
    public static void main(String[] args) 
    {
        System.out.println("Driver Main Start()...");

        User us1 = new User("Pradhum", "pk123", "8084267802");
        User us2 = new User("Aakash", "ak123", "808989654564");
        User us3 = new User("Sahwaj ", "sk123", "909876544");

        System.out.println("Driver main End");
    }
}
