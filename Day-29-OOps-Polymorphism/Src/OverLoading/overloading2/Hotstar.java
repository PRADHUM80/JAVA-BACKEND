package OverLoading.overloading2;


/*
 * Overloading -->
 * same MethodName --> But Different Parameter.
 */

public class Hotstar 
{
    //	Method1.
	
	public void doLogin(String mobile, int otp)
	{
		System.out.println("Login Successfull!!!.. . doLogin(String mobile, int otp) " + mobile + " " + otp);
	}
	
//	Method2.
	
	public void doLogin(String email, String pass)
	{
		System.out.println("Login Successfull !! ... doLogin(String email, String pass) " + email + " " + pass);
	}
	
//	Method3.
	
	public void doLogin(String userName, String userPass, int otp)
	{
		System.out.println("Login Successfull !!.. doLogin (String userName, String userPass, int otp)" + userName + " " + userPass + " " + otp);
	}
}
