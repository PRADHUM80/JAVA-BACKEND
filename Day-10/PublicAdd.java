public class PublicAdd {
    
    public void add(int a, int b)
    {
        int sum = a + b;
        System.out.println("Sum of two numbers is : " + sum);

    }

    public static void main(String[] args) {
        
        PublicAdd obj = new PublicAdd();
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        obj.add(a, b);

    }
}
