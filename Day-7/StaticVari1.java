public class StaticVari1 {

    // instance variable declaration

    String name;
    int age;
    int marks;

    // static variable declaration
    static String collegeName = "SIET College";

    public static void main(String[] args) {
        StaticVari1 student = new StaticVari1();
        student.name = "Pradhum Kumar";
        student.age = 20;
        student.marks = 85;
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Student Marks: " + student.marks);
        System.out.println("College Name: " + StaticVari1.collegeName);

        StaticVari1 student2 = new StaticVari1();
        student2.name = "Sahbaj Singh";
        student2.age = 21;
        student2.marks = 90;
        System.out.println("Student Name: " + student2.name);
        System.out.println("Student Age: " + student2.age);
        System.out.println("Student Marks: " + student2.marks);
        System.out.println("College Name: " + StaticVari1.collegeName);
    }


    
}
