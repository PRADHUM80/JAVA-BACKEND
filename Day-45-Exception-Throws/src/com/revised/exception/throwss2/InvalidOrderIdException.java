package com.revised.exception.throwss2;

public class InvalidOrderIdException extends RuntimeException
{
	public InvalidOrderIdException(String msg)
	{
		super(msg);
	}
}
