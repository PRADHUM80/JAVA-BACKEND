public class CompareTest1 {
    public static void main(String[] args) {
        
        String s1 = "Pradhum"; // SCP
        String s2 = "Kumar";  // SCP

        System.out.println(s1 == s2); //False --> Bcz address is defernece..

        // Existing The Perivious Value In SCP --> Pradhum --> Same Address store..
        String s3 = "Pradhum";
        String s4 = "Pradhum";

        System.out.println(s1 == s3); // SCP . True....

        

        
    }

}
