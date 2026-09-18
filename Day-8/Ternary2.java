//  Checking Even or Odd..
public class Ternary2 {

    public static void main(String[] args) {
        
        int number = Integer.parseInt(args[0]);

        String result = (number % 2 == 0) ? "Even" : "Odd";

        System.out.println("The number " + number + " is " + result);
    }
    
}
