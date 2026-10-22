
class Employee
{
    public void markin()
    {
        System.out.println("Employee markin().... Employee marking in");
    }
}

class HRManager extends Employee
{
    @Override 
    public void markin()
    {
        System.out.println("HRManager markin().... Manager is marking....");
    }
}
public class EmployeeMain 
{
    public static void main(String[] args) 
    {
        // Employee e1 = new Employee();
        // e1.markin();
        
        		Employee e2 = new HRManager(); // Parent class can reffer to child class.
		        e2.markin(); // Same method will behave differently based on the actual objects..
//		1st HRManager check this method markIn() . then Employee..
		/*
		 * 1. at the time of compilation, i will check the method's exist in class Employee... --> markIn()..
		 * 
		 * 2. at the time of execution(while Running) it will call the method on actual..  --> new HRMAnager()..
		 */
    }    
}
