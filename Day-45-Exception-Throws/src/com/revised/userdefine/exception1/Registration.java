package com.revised.userdefine.exception1;

public class Registration 
{
	public void register(String email) throws UserAlreadyExistsException
	{
		String existEmail = "pradhum443@gmail.com";
		
		if(existEmail.equals(email))
		{
//			Throw errors..
			throw new UserAlreadyExistsException("Email is Already exist..");
		}
		else
		{
			System.out.println("Registration Successfull!!");
		}
	}
}
