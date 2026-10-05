
class Employee
{
    String name;
    int id;
    int salary;

    Employee(String name, int id, int salary)
    {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
}

public class Arrray4 {
    
    public static void main(String[] args) {
        
        // Create Employee Object...
        Employee details1 = new Employee("Pradhum", 01, 16000);
        Employee details2 = new Employee("Akash", 02, 25000);
        Employee details3 = new Employee("Nanadani", 03, 15000);
        Employee details4 = new Employee("Omkar", 04, 21000);
        Employee details5 = new Employee("Shawaj", 05, 25000);

        // Employee Array is Created..
        Employee emp[] = new Employee[5];
        emp[0] = details1;
        emp[1] = details2;
        emp[2] = details3;
        emp[3] = details4;
        emp[4] = details5;

        // for loop
        for(int i = 0; i < emp.length; i++)
        {
            if(emp[i].salary < 20000)
            {
                System.out.println("Employee Name : " + emp[i].name);
                System.out.println("Employee Salary : " + emp[i].salary);
            }
        }
    }
}
