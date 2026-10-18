
class User
{
    //Instance variable..
    String name;
    String phoneNo;

    //User Constructor...
    User(String name, String phoneNo)
    {
        this.name = name;
        this.phoneNo = phoneNo;
    }
}


public class ArrayTest2 {
    
    public static void main(String[] args) {
        // User Object Created..

        User u1 = new User("Pradhum", "809808988888");
        User u2 = new  User("Ankit", "909090909090");
        User u3 = new User("Sahawaj ", "887878787878");
        User u4 = new User("Aakash", "76767676767");

        // Store The Object....
        User  user[] = new User[4];
        user[0] = u1;
        user[1] = u2;
        user[2] = u3;
        user[3] = u4;

        for(int i = 0; i < user.length; i++)
        {
            System.out.println(user[i].name + " " + user[i].phoneNo);
        }

    }
}
