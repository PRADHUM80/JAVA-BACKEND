class StudentInstance
{
	String stdName;
	int stdMarks;
	int stdRollNo;
	String stdAdd;
	
	public static void main(String args[])
	{
		// creating 1st Object Od StudentInstance class..
		StudentInstance st = new StudentInstance();
		st.stdName = "Pradhum Kumar";
		st.stdMarks = 73;
		st.stdRollNo = 47;
		st.stdAdd = "Dhenkanal";
		
		// when we print the object with Reference variable. Without Referencevariable cannot be print...
		System.out.println("Name : " + st.stdName);
		System.out.println("Marks : " + st.stdMarks);
		System.out.println("Roll No : " + st.stdRollNo);
		System.out.println("Address : " + st.stdAdd);
		
		// Creating 2nd Object Of StudentInstance class...
		StudentInstance st2 = new  StudentInstance();
		st2.stdName = "Sahwaj Ansari";
		st2.stdMarks = 80;
		st2.stdRollNo = 17;
		st2.stdAdd = "BTM";
		
		System.out.println("Name : " + st2.stdName);
		System.out.println("Marks : " + st2.stdMarks);
		System.out.println("Roll No : " + st2.stdRollNo);
		System.out.println("Address : " + st2.stdAdd);
	}
		
		
}