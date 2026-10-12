public class Replace {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder(" i Love Python");
        sb.replace(7, 14, " java");

        System.out.println(sb);
    }
}
