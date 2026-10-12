public class Intern {
    
    public static void main(String[] args) {
        
        String s2 = "Pradhum"; // SCP
        String s3 = "Kumar"; 

        String s4 = s2 + s3; // HEap --> New StringBuilder is Created..
        System.out.println(s4);

        String s5 = "PradhumKumar";
        System.out.println(s5 == s4.intern()); // True.
        
    }
}
