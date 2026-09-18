
// Check Greater between two numbers
class Realtional1
{
    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        if(a > b)
        {
            System.out.println(a + " is greater than " + b);
        }
        else if(a < b)
        {
            System.out.println(b + " is greater than " + a);
        }
        else
        {
            System.out.println(a + " is equal to " + b);
        }
    }
}