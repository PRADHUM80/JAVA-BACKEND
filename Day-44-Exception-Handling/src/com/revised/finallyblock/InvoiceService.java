package com.revised.finallyblock;

public class InvoiceService 
{
	public void generateInvoice()
	{
		/**
		 * Get Customer & Order details From DataBase...
		 * 1. Connect With DataBase --> Create DB Connection + get Details FROM DB..
		 * 
		 * 2. finnall
		 */
		
		try
		{

			connectionDataBase(); // Creating Connection...
			
//			String name = null;
			String name = "iuytrew";
			name.lastIndexOf("a");
			System.out.println("Generating an invoices....");
			
			closeDataBase(); // Close Connection..
//			System.exit(0);  Killing JVM..  Dobut.
		}
		
		catch (Exception e)
		{
			System.out.println("Some Exception...");
			e.printStackTrace();
		}
		
		finally
		{
//			Manadatory Executable block (Exception OR NO Exception)
			System.out.println("I am inside Finally Block ");
		}
	}
	
	private void connectionDataBase()
	{
		System.out.println("Connnetcion ..");
	}
	
	private void closeDataBase()
	{
		System.out.println("closeDataBase. close");
	}
}
