public class Car 
{
    // Public --> To Exposed The Functionality..
    
    public void driveCar(String sateringWheel, String accelerator, String breaks)
	{
		enginePiston(breaks);
		fuelInjector(breaks);
		sparkPlug(breaks);
	}
	
//	Core Functionalities..
	public boolean fuelInjector(String fuel)
	{
		System.out.println("DriveCar. fuelInjector()....");
		return true;
	}
	
//	Core Functionalities..
	public boolean sparkPlug(String plug)
	{
		System.out.println("DriveCar . spakPlug()..");
		return true;
	}
	
//	Core Functionalities..
	public boolean enginePiston(String piston)
	{
		System.out.println("DriveCar . enginePiston");
		return true;
	}
}
