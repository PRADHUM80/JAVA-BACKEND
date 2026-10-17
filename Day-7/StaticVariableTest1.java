class StaticVariableTest1
{
// Instance Variable...
	String name;
	int rollNo;
	String add;
// Static Variable --> common for all Objects..
	static String clgName = "SIET";
	
	public static void main(String args[])
	{
		StaticVariableTest1 sv = new StaticVariableTest1();
		sv.name = "Pradhum Kumar";
		sv.rollNo = 47;
		sv.add = "Ara";
		System.out.println("Name : " + sv.name);
		System.out.println("Roll No : " + sv.rollNo);
		System.out.println("Add : "+ sv.add);
		
		//Print Static Variable.... Calling From Class Name ..
		System.out.println("College : " + StaticVariableTest1.clgName);
		
		// Creating Another Objects..
		
		StaticVariableTest1 sv1 = new StaticVariableTest1();
		sv1.name = "Aakash";
		sv1.rollNo = 17;
		sv1.add = "Bihar";
		
		System.out.println("Name : " + sv1.name);
		System.out.println("Roll No : " + sv1.rollNo);
		System.out.println("Add : "+ sv1.add);
		
		System.out.println("College : " + StaticVariableTest1.clgName);
		
	}	
}