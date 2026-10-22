
class English
{
    public void teach()
    {
        System.out.println("English Teacher .. teach");
    }
}


class Java extends English
{
        @Override 
        public void teach()
        {
            System.out.println("Java Learning...");
        }
}

public class TeacherMain 
{
    public static void main(String[] args) {
        
        // Parent class can refer to the child class --- > UPCASRTING.
        English e = new Java();
        e.teach();

        // Same method will behave differently based on the actual objects..
//		1st HRManager check this method teach() . then Employee..
		/*
		 * 1. at the time of compilation, i will check the method's exist in class Employee... --> teach()..
		 * 
		 * 2. at the time of execution(while Running) it will call the method on actual..  --> new Java()..
		 */

    }    
}
