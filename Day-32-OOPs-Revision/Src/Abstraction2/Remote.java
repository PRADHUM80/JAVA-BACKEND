package Src.Abstraction2;

public class Remote {
    
    public void clickButton(int button)
	{
		buttonWork(button);
	}
	
	private int buttonWork(int button)
	{
		System.out.println("Click power on");
		return button;	
	}
}
