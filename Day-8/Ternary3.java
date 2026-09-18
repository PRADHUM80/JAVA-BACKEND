//  greater Number..

public class Ternary3 {
    
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int greater = (a > b) ? a : b;

        System.out.println("Greater Number: " + greater);
    }
}
