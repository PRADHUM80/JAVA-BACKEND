import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Age : ");
        int age = sc.nextInt();

        sc.nextLine(); // Consume The Next Char 

        System.out.println("Enter Address");
        String add = sc.nextLine();

        System.out.println("Name : " + name);
        System.out.println("Age  :  " + age);
        System.out.println("Address : "  + add);
    }    
}
