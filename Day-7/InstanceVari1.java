public class InstanceVari1 {
    
    // Instance Variable declaration
    String name;
    int age;
    int marks;

    public static void main(String[] args) {
        InstanceVari1 student = new InstanceVari1();
        student.name = "John Doe";
        student.age = 20;
        student.marks = 85;

        System.out.println("Student Name: " + student.name);
        System.out.println("Student Age: " + student.age);
        System.out.println("Student Marks: " + student.marks);
    }
}
