package Src.Hotstar;

public class Driver 
{
    public static void main(String[] args) {
        

        User usr1 = new User("Pradhum123", "Pradhum", "free");
        User usr2 = new User("Pradhum123", "Pradhum", "free");
        User usr3 = new User("Pradhum123", "Pradhum", "free");
        User usr4 = new User("Pradhum123", "Pradhum", "free");
        User usr5 = new User("Pradhum123", "Pradhum", "free");

        User usr6 = new User("Ankit", "Paid");
        User usr7 = new User("Ankit", "Paid");
        User usr8 = new User("Ankit", "Paid");

        for(int i = 1; i <= 92; i++)
        {
            User usr = new User("Pradhum", "paid");
        }


        System.out.println("Total people Watch Live is : " + User.liveUserCount);




    }    
}


// javac -d out src\Hotstar\User.java  src\Hotstar\Driver.java --> For Compilation
// java -cp out Src.Hostar.Driver --> For Run 