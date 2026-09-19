public class PublicStatic {
    
    public static int multiply(int a, int b)
    {
        int product = a * b;
        System.out.println("Product of two numbers is : " + product);
        return product;
    }

    public static void main(String[] args) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        PublicStatic.multiply(a, b);
    }
}
