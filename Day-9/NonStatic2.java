public class NonStatic2 {
    
    public static void main(String[] args) {

        NonStatic2 obj = new NonStatic2();
        int number = Integer.parseInt(args[0]);
        obj.square(number);
      
    }

    void square(int number) {
        System.out.println("The square of " + number + " is: " + (number * number));
    }
}
