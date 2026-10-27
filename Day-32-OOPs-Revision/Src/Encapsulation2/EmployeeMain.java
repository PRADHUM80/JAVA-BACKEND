package Src.Encapsulation2;

public class EmployeeMain {
    
    public static void main(String[] args) {
        
        Employee emp = new Employee("Code123", "Pradhum", 7000.0);

        emp.increaseSalary(5000.0);
		System.out.println(emp.getEmpId());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
    }
}
