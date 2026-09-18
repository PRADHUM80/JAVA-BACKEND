//  Eligible for Vote 

public class StaticMethods3 {

    static void eligibleForVote(int age)
    {
        if(age >= 18)
        {
            System.out.println("The person is eligible for vote");
        }
        else
        {
            System.out.println("The person is not eligible for vote");
        }
    }

    public static void main(String args[])
    {
        int age = Integer.parseInt(args[0]);
        StaticMethods3.eligibleForVote(age);
    }
    
}
