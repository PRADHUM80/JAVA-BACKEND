// package If-Else;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age : ");
        int year = sc.nextInt();

        if(year >= 18)
        {
            System.out.println("Elegible for Vote..");
        }
        else{
            System.out.println("not eligible !!!!!!!!!");
        }
    }
    
}
