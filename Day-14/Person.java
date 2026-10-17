
class Children 
{
    Children (String name)
    {
        System.out.println("Name is : " + name);
    }
}

class Student extends  Children
{
    Student(String name)
    {
        super(name);
        System.out.println("Student Printing..");
    }
}




public class Person {
    
    public static void main(String[] args) {
        
        Student ss = new Student("Pradhum Kumar");
    }
}
