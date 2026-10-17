 class Marks
// Public Class --> class name same as FileName 
// Without public Class --> class name not as Same FileName....

{
	public static void main(String args[])
	{
		int math = Integer.parseInt(args[0]);
		int eng = Integer.parseInt(args[1]);
		int evs = Integer.parseInt(args[2]);
		
		System.out.println("Math : " + math);
		System.out.println("English : " + eng);
		System.out.println("Evs : " + evs);
	}
}