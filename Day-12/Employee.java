public class Employee {
    
    String name;
    int  Salary;

    Employee(String name, int Salary)
    {
        this.name = name;
        this.Salary = Salary;
    }

    void display()
    {
        System.out.println("Employee Name is : " + name);
        System.out.println("Employee Salary is : " + Salary);
    }

    public static void main(String[] args) {
        
        Employee emp = new Employee("Rahul", 30000);
        emp.display();
    }
}
