package Src.Encapsulation2;

public class EmployeeSalaryMain 
{
    
    public static void main(String[] args) {
        
        EmployeeSalary emp = new EmployeeSalary();

        emp.setEmployeeSalary(1000);

        System.out.println(emp.getSalary());
    }
}
