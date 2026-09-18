public class NonStatic4 {
    
    public static void main(String[] args) {
        
        NonStatic4 obj = new NonStatic4();
        int p = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        int t = Integer.parseInt(args[2]);
        obj.simpleInterest(p, r, t);
    }

    void simpleInterest(int p, int r, int t) {
        System.out.println("The simple interest is: " + (p * r * t) / 100);
    }
}
