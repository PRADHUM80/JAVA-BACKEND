package Src.Encapsulation4;

public class EmployeeBonus 
{

    private  String name;
    private double salary;

    public EmployeeBonus(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public void calculateBonus(double amount)
    {
        if(amount > 0)
        {
            System.out.println(salary);
            salary = salary + amount;
            System.out.println(name);
            System.out.println(salary);
            System.out.println(amount);
        }
    }

    public  double getBonus()
    {
        return  salary;
    }
}
