public class PrivateCheckEven {
    
    private void checkEvenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("This number is Even:");
        }
        else
        {
            System.out.println("This Number is Odd: ");
        }

    }

    public static void main(String[] args) {
        
        PrivateCheckEven obj = new PrivateCheckEven();
        int n = Integer.parseInt(args[0]);
        obj.checkEvenOdd(n);

    }
}
