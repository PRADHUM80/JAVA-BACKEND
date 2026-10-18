
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

public class EmployeMain {
    
    public static void main(String[] args) {
        
        // Employee Details  Creating a Object...
        Employee emp1 = new Employee("Pradhum ", 1, 300000);
        Employee emp2 = new Employee("Aakash", 2, 310000);
        Employee emp3 = new Employee("Balu", 3, 290000);

        // Add Elements..
        Employee emp[] = new Employee[3];
        emp[0] = emp1;
        emp[1] = emp2;
        emp[2] = emp3;

        for(int i = 0; i < emp.length; i++)
        {
            System.out.println("Employee Name : " + emp[i].name + "ID : " + emp[i].id + "Salary : " + emp[i].salary);

            if(emp[i].salary > 300000)
            {
                System.out.println(emp[i].name + " " + emp[i].salary);
            }
        }
    }
}
