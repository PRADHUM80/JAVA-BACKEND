package Src.StaticInitBlock;

public class User {
    
    String userName;
    String userId;
    String mobileNumber;

    static {
        System.out.println("I am in Static init block...");
    }

    public User(String userName, String userId, String mobileNumber) {
        super();

        this.userName = userName;
        this.userId = userId;
        this.mobileNumber = mobileNumber;
    }
}
