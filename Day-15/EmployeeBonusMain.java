import java.util.Scanner;

class EmployeeBonus 
{
    public void calculateBonus(int salary, int experience, String performance)
    {
        double bonus = 0;
        if(experience < 2)
        {
            bonus = 0;
        }

        else if (experience <= 5)
        {
            if(performance.equals("Excellent"))
            {
                bonus = salary * 0.15;
            }
            else if(performance.equals("Good"))
            {
                bonus = salary * 0.10;
            }
            else 
            {
                bonus  = salary * 0.05;
            }
        }
        else 
        {
            if(performance .equals("Excellent"))
            {
                bonus = salary * 0.20;
            }
            else if (performance .equals("Good"))
            {
                bonus = salary * 0.15;
            }
            else 
            {
                bonus = salary * 0.5;
            }
        }

        double finalSalary = salary + bonus;
        System.out.println(salary);
        System.out.println(bonus);
        System.out.println(finalSalary);
    }
}




public class EmployeeBonusMain {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Salary : ");
        int salary = sc.nextInt();

        System.out.println("Enter Experience !!");
        int experience = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter Performance");
        String performance = sc.nextLine();

        EmployeeBonus emp = new EmployeeBonus();
        emp.calculateBonus(salary, experience, performance);
    }
}
