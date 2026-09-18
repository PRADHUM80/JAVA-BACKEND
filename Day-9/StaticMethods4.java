//  three number largest number

public class StaticMethods4 {

    public static void main(String[] args) {
        
        int firstNumber = Integer.parseInt(args[0]);
        int secondNumber = Integer.parseInt(args[1]);
        int thirdNumber = Integer.parseInt(args[2]);

        StaticMethods4.largestNumber(firstNumber, secondNumber, thirdNumber);

    }

    static int largestNumber(int firstNumber, int secondNumber, int thirdNumber) {

        if(firstNumber > secondNumber && firstNumber > thirdNumber)
        {
            System.out.println("The largest number is: " + firstNumber);
            return firstNumber;
        }
        else if(secondNumber > firstNumber && secondNumber > thirdNumber)
        {
            System.out.println("The largest number is: " + secondNumber);
            return secondNumber;
        }
        else
        {
            System.out.println("The largest number is: " + thirdNumber);
            return thirdNumber;
        }
    }
    
}
