public class Employee {
    
    Employee()
    {
        this(20, "Pradhum");
        System.out.println("No args...");
    }

    Employee(int age, String name)
    {
        System.out.println("Age : " + age);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        Employee emp = new  Employee();
    }
}
