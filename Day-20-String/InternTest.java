public class InternTest {
    public static void main(String[] args) {
        
        String s1 = "Pradhum";
        String s2 = "pradhum";

        // Case Sensitive..
        System.out.println(s1 == s2); // False --> "Case-Sensitive..."
        System.out.println(s1.intern() == s2); // False
        System.out.println(s1.equals(s2)); //False..
    }
}
