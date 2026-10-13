public class Intern1 {
    

    public static void main(String[] args) {
        
        String s1 = new String("Ja") + new String("Va");

        s1.intern();

        String s2 = "JaVa";
        System.out.println(s1 == s2);
    }
}
