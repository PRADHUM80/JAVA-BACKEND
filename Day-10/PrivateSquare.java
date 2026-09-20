public class PrivateSquare {
    
    private int square(int a)
    {
        return a * a;
    }

    public static void main(String[] args) {
        
        PrivateSquare obj = new PrivateSquare();
        
        int a = Integer.parseInt(args[0]);
        int result = obj.square(a);
        System.out.println("Square of the number is : " + result);

    }
}
