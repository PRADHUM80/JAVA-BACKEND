package Src.Inheritance2;

public class Vehicle {
    
    public void start() 
	{
        System.out.println("Vehicle starts");
    }

    public void stop() 
    {
        System.out.println("Vehicle stops");
    }
}

class Car extends  Vehicle
{
    public void trunOnAc()
    {
        System.out.println("Car Ac is On");
    }
}