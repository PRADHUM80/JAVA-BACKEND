import java.util.Scanner;

public class WhileLoop1 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int luckyNumber = 13;
        int userEntered = 0;

        while (luckyNumber != userEntered) 
        {
            System.out.println("Enter a Number : ");
            userEntered = sc.nextInt();
            
            if(userEntered == luckyNumber)
            {
                System.out.println("You Won !!");
            }
            else
            {
                System.err.println("Pls Try Again!!!!");
            }
        }
    }    
}
