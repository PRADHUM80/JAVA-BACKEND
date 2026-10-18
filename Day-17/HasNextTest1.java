import java.util.Scanner;

public class HasNextTest1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int price = 0;

        System.out.println("Enter the Price : ");
        //Checking the NextElement is Int (HasNext --> )

        if(sc.hasNextInt())
        {
            price = sc.nextInt();
        }
        else{
            // System.out.println("Enter The Price RightForm : ");
            System.err.println("Enter The Price RightForm : ");
        }
        sc.close();

        System.out.println(price);
    }
}
