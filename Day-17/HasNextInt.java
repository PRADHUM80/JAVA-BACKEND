import java.util.Scanner;

class HasNextInt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int price = 0;
        System.out.println("Enter Price : ");
        if(sc.hasNextInt())
        {
            price = sc.nextInt();
        }
        else 
        {
            System.out.println("Enter The Price is Right Form!!!!!!!!");
        }
        
    }
}