// Check passing Marks abvoe 40..


public class Realtion3 {

    public static void main(String[] args) {
        
        int marks = Integer.parseInt(args[0]);

        if(marks >= 40)
        {
            System.out.println("You have passed the exam with " + marks + " marks.");
        }
        else
        {
            System.out.println("You have failed the exam with " + marks + " marks.");
        }
    }
    
}
