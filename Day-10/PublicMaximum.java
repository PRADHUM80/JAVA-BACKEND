public class PublicMaximum {
    
    public int findMaximum(int a, int b, int c)
    {
        if(a > b && a > c)
        {
            return a;
        }
        else if(b > c && b > a)
        {
            return b;
        }
        else
        {
            return c;
        }
    }

    public static void main(String[] args) {
        
        PublicMaximum obj = new PublicMaximum();
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int max = obj.findMaximum(a, b, c);
        System.out.println("Maximum of three numbers is : " + max);

    }
}
