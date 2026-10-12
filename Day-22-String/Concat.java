class Concat
{
    public static void main(String[] args) {
        
        String s3 = new String("Hello"); // SCP + HEAP

        String s4 = s3.concat(" World"); // SCP + HEAP

        System.out.println(s4); // 2 Objects .. Here...
    }
}