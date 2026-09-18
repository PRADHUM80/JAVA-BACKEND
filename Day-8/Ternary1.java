//  Pass or Fail..

public class Ternary1 {
    
    public static void main(String[] args) {
        
        int marks = Integer.parseInt(args[0]);

        String result = (marks >= 35) ? "Pass" : "Fail";

        System.out.println("Result: " + result);
    }
    
}
