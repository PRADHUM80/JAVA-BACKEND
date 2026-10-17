

public class Parameterized 
{
    String empName;
    int empId;

    public Parameterized(String empName, int empId)
    {
        this.empName = empName;
        this.empId = empId;
    }

    public void display()
    {
        System.out.println("Name : " + empName);
        System.out.println("ID : " + empId);
    }

    public static void main(String[] args) {
        
        Parameterized pp = new Parameterized("Pradhum", 11);
        pp.display();
    }
    
}