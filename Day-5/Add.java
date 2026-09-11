
class Add
{
    public static void main(String[] args) 
    {
        String firstNumber = args[0];
        String secondNumber = args[1];

        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(secondNumber);

        System.out.println("Sum of " + first + " and " + second + " is: " + (first + second));
        
    }
}