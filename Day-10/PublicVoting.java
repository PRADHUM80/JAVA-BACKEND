public class PublicVoting {
    public void checAge(int age)
    {
        if(age >= 18)
        {
            System.out.println("You are eligible to vote.");
        }
        else
        {
            System.out.println("You are not eligible to vote.");
        }
    }

    public static void main(String[] args) {
        
        PublicVoting obj = new PublicVoting();
        
        int age = Integer.parseInt(args[0]);

        obj.checAge(age);

    }
}
