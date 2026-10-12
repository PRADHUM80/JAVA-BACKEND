public class Intern {
    
    public static void main(String[] args) {
        
        String str1 = "Pradhum";

        String str2 = new String("Pradhum");

         System.out.println(str1 == str2); // false
         System.out.println(str1.equals(str2)); // True.

         String str3 = str1.intern();
         System.out.println(str3 == str1); // True. convert Heap to Scp ...

         System.out.println(str3 == str2);
    }
}
