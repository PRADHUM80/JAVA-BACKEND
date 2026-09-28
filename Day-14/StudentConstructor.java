public class StudentConstructor {
    
    String name;

    StudentConstructor(String name)
    {
        this(20);
        this.name = name;
    }

    StudentConstructor(int age)
    {
        System.out.println("Age : " + age);
    }


}
