public class PrivateSum {
    private  int sum(int a, int b, int c, int res)
    {
        System.out.println("Sum is : " + res);
        return  res;
    }

    public static void main(String[] args) {
        
        PrivateSum  ad = new PrivateSum();
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int res = a + b + c;

        ad.sum(a, b, c, res);
    }
}
