class DrivingLicense
{
	public static void main(String args[])
	{
		int minAge = 18;
		int maxAge = 60;
		
		String name = args[0];
		int userAge = Integer.parseInt(args[1]);
		
		System.out.println("Applying DL for : " + name);
		
		System.out.println("Condition 1 : " + (minAge < userAge));
		System.out.println("Condition 2 : " + (maxAge > userAge));
		
		//System.out.println("Allowed For DL : " + (minAge < userAge) && (maxAge > userAge));
		
		String message = minAge < userAge ? "Allowed" : "Not Allowed";
		System.out.println(message);
	}
}