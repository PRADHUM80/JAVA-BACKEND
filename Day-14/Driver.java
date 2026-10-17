
// Here  Extends --> KeyWords .   
// every class Extends as --> Object.(default..)
class SuperUser extends  Object
{

}

class User extends  SuperUser
{
    String userName;
    String userId;
    String mobile;

    // Constructor..

  public   User(String userName, String userId, String mobile)
    {
        this(300); // Calling Same Class (USer Constructor)
        this.userName = userName;
        this.userId = userId;
        this.mobile = mobile;
    }


public  User(int number)
{
    System.out.println("No args.....");
}

}

class Driver{

    public static void main(String[] args) {
        
        User obj = new User("Pradhum ", "Pk123", "8084267802");

        System.out.println(obj.userName + " " + obj.userId + " " + obj.mobile);
    }
}