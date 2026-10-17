class InstanceTest1
{
	String name;
	int age;
	
	public static void main(String args[])
	{
		// Creating Object --> Bcz using InstanceVariable then  create a Objects.
		
		//
		InstanceTest1 pp = new InstanceTest1();
		pp.name = "Pradhum Kumar";
		pp.age = 22;
		
		System.out.println("Name : " + pp.name);
		System.out.println("Age : " + pp.age);
		
		InstanceTest1 i = new InstanceTest1();
		i.name = "Ankit";
		i.age = 21;
		
		System.out.println("Name : " + i.name);
		System.out.println("Age : " + i.age);
	}
}