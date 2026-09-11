public class Marks 
{
    public static void main(String[] args) {
        String java = args[0];
        String python = args[1];
        String cpp = args[2];
        
        int javaMarks = Integer.parseInt(java);
        int pythonMarks = Integer.parseInt(python);
        int cppMarks = Integer.parseInt(cpp);

        int totalMarks = javaMarks + pythonMarks + cppMarks;

        System.out.println("Total Marks: " + totalMarks);
    }
    
}
