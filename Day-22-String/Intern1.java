public class Intern1 {
    

    public static void main(String[] args) {
        
        String s1 = new String("Ja") + new String("Va"); // Scp "Ja" + "Va" && Heap "JaVa".
        s1.intern(); // SCP "Java" since java is not there in SCP during inter will copy "JAVA" FRom HEAP TO SCP. And S1 Points to scp.
        String s2 = "JaVa";
        System.out.println(s1 == s2); //True


    }
}
