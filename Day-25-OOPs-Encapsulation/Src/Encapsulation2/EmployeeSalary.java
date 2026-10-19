package Src.Encapsulation2;

public class EmployeeSalary 
{
    private int salary;
    
    public void setEmployeeSalary(int salary)
    {
        if(salary > 0 )
        {
            this.salary = salary;
        }
        
    }

    public int getSalary()
    {
        return  salary;
    }
}
