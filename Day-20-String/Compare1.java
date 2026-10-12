public class Compare1 {
    
    public static void main(String[] args) {
        
        // literal 
        String str = "Pradhum"; // its Store in SCP--> String Constant Pool.

        // new Keyword or object..
        String str1 = new String("Pradhum");

        System.out.println(str == str1); // false Object Is store in Heap..


        System.out.println(str.equals(str1));  // True . 
        // Content Same so Its True..

        
        
    }
}
