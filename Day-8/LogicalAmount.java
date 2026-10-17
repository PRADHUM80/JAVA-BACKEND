class LogicalAmount
{
	public static void main(String args[])
	{
		int amountByUser = Integer.parseInt(args[0]);
		int minAmount = 1;
		int maxAmount = 2000;
		
		System.out.println("Condition1 : " + (amountByUser > minAmount));
		System.out.println("Condition2 : " + (amountByUser < maxAmount));
		
		System.out.println((amountByUser > minAmount) || (amountByUser < maxAmount));
	}
}