public class DeliveryMain {
    
    public static void main(String[] args) {
        
        Delivery del = new Delivery();  // Like int amount = 100;
		/**
		 * Compile Time --> it will check the Methods in Delivery class..
		 * RunTime --> it will Call The Methods of Delivery Class..
		 * del.doDeliver()... --> Runtime..
		 */
		del.doDeliver(); //Delivery ... doDeliver()...

//		Parent class is Object Of Child Class..
		Delivery del1 = (Delivery)new ExpressBee();
		// Compile --> it wil check the Methods in Delivery Class..
//			RuntIme --> it will call the Methods of ExpressBee clss..
		del1.doDeliver(); //ExpressBee ... doDeliver()...
		
//		DownCasting..
		
		Delivery del2 = new ExpressBee();
		ExpressBee exp = (ExpressBee) del2; //del --> cast error...
		/**
		 * Exception in thread "main" java.lang.ClassCastException: class com.revised.polymorphism.Delivery cannot be cast to class com.revised.polymorphism.ExpressBee (com.revised.polymorphism.Delivery and com.revised.polymorphism.ExpressBee are in unnamed module of loader 'app')
	at com.revised.polymorphism.DeliveryMain.main(DeliveryMain.java:24)

			del --> Parent class Ref..So Error 
			So..
			
				del2 not showing Error.
		 */
		exp.doDeliver();
		
	}

    
}
