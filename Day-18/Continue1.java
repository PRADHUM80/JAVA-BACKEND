import java.util.Scanner;

class Continue1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number : ");
        for(int i = 1; i <= 10; i++)
        {
            int number = sc.nextInt();
            if(number == 5)
            {
                continue;
            }
            System.out.println(number);
        }
    }
}