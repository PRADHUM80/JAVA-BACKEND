package Src.Abstraction2;

public class Car {
    
    public void Drive(String working, String oil, String cc)
	{
		piston(working);
		enginOil(oil);
		cc(cc);
	}
	
	private String piston(String working)
	{
		System.out.println("Piston is Working");
		return "Working";
	}
	
	private String enginOil(String oil)
	{
		System.out.println("Engine oil is Half..");
		return "EngineOil";
		
	}
	
	private String cc(String cc)
	{
		System.out.println("4Cylender");
		return "cc";
	}
}
