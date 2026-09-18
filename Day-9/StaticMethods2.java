// Even  or Odd
public class StaticMethods2 {

    static int evenOrOdd(int number)
    {
        if(number % 2 == 0)
        {
            System.out.println("The number " + number + "is Even");
            return 0;
        }
        else
        {
            System.out.println("The number " + number + "is Odd");
            return 1;
        }
    }
    
    public static void main(String args[])
    {
        int number = Integer.parseInt(args[0]);
        StaticMethods2.evenOrOdd(number);
    }
}
