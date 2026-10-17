class LogicalBank
{
	
	public static void main(String args[])
	{
		String userName = "Pradhum";
		String pass = "Pradhum@123";
		boolean otpVerified = true;
		boolean accountActive = true;
		boolean accountLocked = false;
		
		if(accountLocked || !accountActive)
		{
			System.out.println("Contact Bank Support.");
		}
		else if (userName.equals("Pradhum") && pass.equals("Pradhum@123") && otpVerified && accountActive && !accountLocked)
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Invailed Cardinls");
		}
	}	
	
}