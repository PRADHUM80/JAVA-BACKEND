public class StaticVari2 
{
    static String company = "ABC Company";
    String empName;
    int empId;
    double empSalary;

    public static void main(String[] args) {
        StaticVari2 employee = new StaticVari2();
        employee.empName = "John Doe";
        employee.empId = 123;
        employee.empSalary = 50000.0;

        System.out.println("Employee Name: " + employee.empName);
        System.out.println("Employee ID: " + employee.empId);
        System.out.println("Employee Salary: " + employee.empSalary);
        System.out.println("Company Name: " + StaticVari2.company);

        StaticVari2 employee2 = new StaticVari2();
        employee2.empName = "Jane Smith";
        employee2.empId = 456;
        employee2.empSalary = 60000.0;
        System.out.println("Employee Name: " + employee2.empName);
        System.out.println("Employee ID: " + employee2.empId);
        System.out.println("Employee Salary: " + employee2.empSalary);
        System.out.println("Company Name: " + StaticVari2.company);
    }
    
}
