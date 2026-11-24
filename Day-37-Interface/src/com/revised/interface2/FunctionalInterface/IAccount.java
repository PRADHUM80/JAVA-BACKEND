package com.revised.interface2.FunctionalInterface;

@FunctionalInterface //--> Means Interface Which Got Only One Abstract MEthods...
public interface IAccount extends IAccountMgmt  // Showing Error Because Functional Interface have Onle One Methods .
// But Here Showing Two Methods below Comments.....
// Error Solve --> @FunctionalInterface Comment ...
{
	void openAccount(); // Onlhy One Abstract Methods .. SAM.. + ONE  Abstract Methods from IAccountMgmt.
	
	
	default void addBeni()
	{
		
	}
}
