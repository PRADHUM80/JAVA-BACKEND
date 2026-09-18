// +1


public class Unary1 {

    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println("Before Increment: " + a);
        System.out.println("Before Decrement: " + b);

        a++;
        b--;

        System.out.println("After Increment: " + a);
        System.out.println("After Decrement: " + b);
    }
    
}
