package Src.Inheritance1;

public class DeliveryPatner extends Object
{
    /**		Inheritance..
	 * 1. One Class  Acquired property of Another class And Reuse The Code..
	 * 2. Achieve - > extends KEywords..
	 * 3. Advantages : 
	 * 			.Code - Reusability
	 * 			.java say that if any functionality is already delevloped , tried , tested, u an Reuse.
	 * 
	 * 4. DisAdvantage :
	 * 			. Tightly - Cuppled.
	 * 			. Heavy Loading -: Means Parent Class 10 line of Code But Childeren Can Access Only 5 
	 * 				Line Of Codes So its HEAVY LOADING..
	 * 
	 * 5. is-a Relationship..
	 * 
	 */   
    
    public void doDelivery()
	{
		System.out.println("DeliveryPartner will dilever..");
	}
}

class XpressBee extends  DeliveryPatner
{
    /**
	 * 					@Override
	 * 1. its annotation , its not compulsory But GOOD to Have..
	 * 2. it will check Rule And Regulation, Case Sensitive...
	 * 3. MEthods name Should Be Same..
	 * 4. Order of Arguments and No of Parameters A&& Types of Order.
	 * 5. Return type Same but except covarient..
	 * 6. Access Modifier Should be same or Widen..
	 * 
	 */

    @Override 
    public void doDelivery()
	{
		System.out.println("DeliveryPartner will dilever.. XpreesBee()");
	}
}

class Ekart extends DeliveryPatner
{
    @Override 
    public void doDelivery()
	{
		System.out.println("DeliveryPartner will dilever..Ekart()");
	}
}