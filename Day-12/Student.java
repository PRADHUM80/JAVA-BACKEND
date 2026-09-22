class Student
{
    String name;
    int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;

        System.out.println("Name is : " + name);
        System.out.println("Age is  : "+ age);
    }

    public static void main(String[] args) {
        
        Student obj = new Student("Pradhum", 22);
    }
}