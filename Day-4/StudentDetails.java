class StudentDetails
{
	public static void main(String args[])
	{
	// here String --> DataType stdName --> NameingConvention...
		String stdName = args[0];
		int stdRollNo = Integer.parseInt(args[1]);
		int stdMarks = Integer.parseInt(args[2]);
	// Print..
		System.out.println("Name : " + stdName);
		System.out.println("Roll No : " + stdRollNo);
		System.out.println("Marks : " + stdMarks);
	}
}