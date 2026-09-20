public class PrivateVariable {
    
    private int a;

    public static void main(String[] args) {
        PrivateVariable obj = new PrivateVariable();
        int a = Integer.parseInt(args[0]);
        obj.a = a;

        System.out.println(obj.a);
    }
}
