
// Add Two Numbers.

class StaticMethods1
{
    public static void main(String[] args) {
        
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);

        int sum = firstNumber + secondNumber;


        StaticMethods1.addNumbers(firstNumber, secondNumber);

    }

    static int addNumbers(int firstNumber, int secondNumber) {

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is: " + (firstNumber + secondNumber));
        return firstNumber + secondNumber;
    }
}