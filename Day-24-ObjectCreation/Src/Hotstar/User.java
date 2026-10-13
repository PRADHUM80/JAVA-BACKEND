package Src.Hotstar;

public class User 
{
    String userId;
    String userName;
    String type;
    
    public static  int liveUserCount = 0;

    // Constructor1.

    public User(String userId, String userName, String type)
    {
        super(); // Default
        this.userId = userId;
        this.userName = userName;
        this.type = type;
    }

    // Constructor2.

    public  User(String userName, String type)
    {
        super();
        this.userName = userName;
        this.type = type;
    }

    // Constructor3.

    public User()
    {

    }

    //  IIB Calling..
    {
        liveUserCount = liveUserCount + 1;
    }
}
