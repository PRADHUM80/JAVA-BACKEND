public class NonStatic3 {
    public static void main(String[] args) {
        
        NonStatic3 obj = new NonStatic3();
        int number = Integer.parseInt(args[0]);
        obj.positiveOrNegative(number);
    }

    void positiveOrNegative(int number) {
        if(number > 0)
        {
            System.out.println("The number " + number + " is Positive");
        }
        else if(number < 0)
        {
            System.out.println("The number " + number + " is Negative");
        }
        else
        {
            System.out.println("The number is Zero");
        }
    }
}
