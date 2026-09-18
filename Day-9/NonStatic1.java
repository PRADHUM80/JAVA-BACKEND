// Add Two Numbers.
public class NonStatic1 {

    public static void main(String[] args) {
        
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        NonStatic1 nonStatic1 = new NonStatic1();
        nonStatic1.addNumbers(firstNumber, secondNumber);
    }

    public void addNumbers(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + sum);
    }

}
