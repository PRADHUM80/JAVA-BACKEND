public class InstanceVari2 {
    
    int empId;
    String empName;
    double empSalary;

    public static void main(String[] args) {
        InstanceVari2 employee = new InstanceVari2();
        employee.empId = 101;
        employee.empName = "sahbaj";
        employee.empSalary = 75000.50;

        System.out.println("Employee ID: " + employee.empId);
        System.out.println("Employee Name: " + employee.empName);
        System.out.println("Employee Salary: " + employee.empSalary);

        InstanceVari2  employee2 = new InstanceVari2();
        employee2.empId = 102;
        employee2.empName = "Pradhum";
        employee2.empSalary = 80000.75;

        System.out.println("Employee ID: " + employee2.empId);
        System.out.println("Employee Name: " + employee2.empName);
        System.out.println("Employee Salary: " + employee2.empSalary);
    }
}
