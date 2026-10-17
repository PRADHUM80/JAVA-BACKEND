
class User
{
    String name;
    String type;
    String country;

    User(String name, String type, String country)
    {
        this.name = name;
        this.type = type;
        this.country = country;

    }

    public User()
    {
        // Calling User Class Constructor....
        this("Guest", "free", "IND");
    }
}

class Signup extends User
{
    public void display()
    {
        User user = new User();
    }
}


public class Netflix {
    
    public static void main(String[] args) {
        
        Signup sign = new Signup();
        sign.display();
    }
}
