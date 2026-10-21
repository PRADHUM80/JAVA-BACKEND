package OverLoading.overloading1;

public class Client
{
    //Private --> Public
	public void doLogin(String mobile, int otp)
	{
		System.out.println("Login.doLogin().... (String mobile, int otp)" + mobile + otp);
	}
	
	public String doLogin(String email, String pass)
	{
		System.out.println("Login.doLogin()...  (String email, String pass) " + email + pass);
		return "some Value";
	}
	
	static void doLogin(String gmail)
	{
		System.out.println("Login.doLogin()... (String gmail) " + gmail);
	}    
}
