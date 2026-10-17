class ElectricBillCalculator
{
	static double calculateBill(int units)
	{
		double bill;
		if(units <= 100)
		{
			bill =  units * 2;
		}
		else if (units <= 200)
		{
			bill = (100 * 2) +	(units - 100) * 3;
		}
		
		else
		{
			bill = (100 * 2) + (100 * 3) + (units - 200) * 5;
		}
		
		return bill;
	}
	
	static void displayBill(double bill)
	{
		System.out.println("Electric Billl : " + bill);
	}

	public static void main(String args[])
	{
		int units = Integer.parseInt(args[0]);
		
		double totalBill = calculateBill(units);
		
		displayBill(totalBill);
	}
		
}