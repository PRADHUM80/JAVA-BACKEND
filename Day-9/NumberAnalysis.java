class StaticNumberAnalysis
{
	static boolean isEven(int num)
	{
		return num % 2 == 0;
	}
	
	static boolean isPrime(int num)
	{
		if(num <= 1)
		{
			return false;
		}
		
		for(int i = 2; i <= num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	static boolean isPositive(int num)
	{
		return num > 0;
	}
	
	public static void main(String args[])
	{
		int num = Integer.parseInt(args [0]);
		
		System.out.println(" IS Even : " + isEven(num));
		System.out.println(" Is Prime : " + isPrime(num));
		System.out.println(" Is Positive : " + isPositive(num));
	}
		
	
}