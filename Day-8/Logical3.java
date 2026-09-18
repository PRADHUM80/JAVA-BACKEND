// &&
public class Logical3 {

    public static void main(String[] args) {
        
        String username = args[0];
        int password = Integer.parseInt(args[1]);

        if(username.equals("admin") && password == 1234)
        {
            System.out.println("Login successful.");
        }
        else
        {
            System.out.println("Invalid username or password.");
        }
    }
    
}
