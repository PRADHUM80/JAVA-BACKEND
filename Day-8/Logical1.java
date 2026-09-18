//Age And Salary..


public class Logical1 {

    public static void main(String[] args) {
        
        int age = Integer.parseInt(args[0]);
        int salary = Integer.parseInt(args[1]);

        if(age >= 18 && salary >= 50000)
        {
            System.out.println("You are eligible for the loan.");
        }
        else
        {
            System.out.println("You are not eligible for the loan.");
        }
    }
    
}
