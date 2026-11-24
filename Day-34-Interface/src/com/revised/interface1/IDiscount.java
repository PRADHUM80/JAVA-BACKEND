package com.revised.interface1;

public interface IDiscount 
{
	/**
	 * here java version 1.7 or 7 or before..
	 * Public --> default take
	 * Abstract --> defaulat take
	 *  Interface have cannot body, so using semicon..
	 *  Abstraction --> Idea, Logic these Not exists..
	 *  
	 *  only write abstract Methods ..
	 *  
	 *  public static final --> COnstant..
	 *  
	 *  canot create object..of Interface.
	 *  its create a constructor..
	 *  
	 *  class to class --> Extends
	 *  interface to interface ---> Extends
	 *  interface to class ---> Implements
	 */
	
	public static final int MAX_VALUE = 100;
	
	public abstract int calculateDiscount(int amount, int rate);
	
//	default
	int calculateDiscountTax(int tax);
}
