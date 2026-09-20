public class PrivateSalary {
    
    private  int salary;

    public void displaySalary()
    {
        System.out.println("Salary is : " + salary);
    }

    public static void main(String[] args) {
        
        PrivateSalary obj = new PrivateSalary();

        int salary = Integer.parseInt(args[0]);

        obj.salary = salary;
        obj.displaySalary();
    }
}
