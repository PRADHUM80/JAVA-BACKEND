public class LaptopMain {
    
    public static void main(String[] args) {
        
        Laptop l = new Laptop();
//		1. Comple -> Check the Methods Avilable or not  in Parent Class
//		2. Runtime -> Call The Methods 
		l.company(); 

//		Parent Class Object in Child Class..
//		UpCasting...
		Laptop l1 = new Dell();
//		1.Compile.
//		2.RunTime.
		l1.company();
		
//		Chiled Class Object in Parent Class.
		Laptop l2 = new Dell();
		Dell d = (Dell)l2;
		d.company();
    }
}
