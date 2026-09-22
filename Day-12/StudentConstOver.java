public class StudentConstOver {
     
    StudentConstOver()
    {
        System.out.println("Constructor : 1");
    }

    String name;
    StudentConstOver(String name)
    {
        this.name = name;
        System.out.println("Constructor : 2");
        System.out.println("name : " + name);
        
    }

    String name1;
    int age;
    StudentConstOver(String name1, int age)
    {
        this.name1 = name1;
        this.age = age;
        System.out.println("Constructor : 3");
        System.out.println("Name1 : " + name1);
        System.out.println("age : " + age);
    }

    public static void main(String[] args) {
        
        StudentConstOver s1 = new StudentConstOver();

        StudentConstOver s2 = new StudentConstOver("Pradhum");

        StudentConstOver s3 = new StudentConstOver("Shawaj", 22);
    }
}
