class Driver
{
    public static void main(String[] args) {
        
        String s1 = "Pradhum"; // SCP --> 123xyz

        String s2 = new String(" Kumar"); // One Object is SCP . And Another One is  HEAP --> 321xyz.

        System.out.println(s1 == s2); // false.  123xyz != 321xyz.

        String s3 = new String("Pradhum");
        String s4 = new String("Pradhum");
        System.out.println(s3 == s4); // false. Address Diff && Creating a anotherObject.

        System.out.println(s3.equals(s4)); // True
        // Bcz contents areSame.. && Case Senstitive..

        
    }
}