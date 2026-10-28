public class MobileMain {
    public static void main(String[] args) {
        
        Mobile m = new Mobile();
		m.phone();
		
//		Upcasting
		Mobile m1 = new Iphone();
		m1.phone();

		Mobile m2 = new Samsung();
		m2.phone();
		
//		DownCasting
		Mobile m3 = new Iphone();
		Iphone i = (Iphone) m3;
		i.phone();
		
		Mobile m4 = new Samsung();
		Samsung s = (Samsung) m4;
		s.phone();
    }
}
