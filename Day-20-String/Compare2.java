public class Compare2 {
    
    public static void main(String[] args) {
        
        // here Creating 2 Objects...
        String str1 = new String("Pradhum");

        String str2 = new String("Pradhum");

        System.out.println(str1.equals(str2)); // True. Bcz Content are Same.

        System.out.println(str1 == str2); // False. Bcz Reference Address is Different .

        String str3 = new  String("pradhum");
        System.out.println(str3.equals(str1)); // False Bcz String is a Case Sensitive.
    }
}
