package comArrayList.FoodDelivery.project;

import java.util.ArrayList;

public class FoodManagementSystem 
{
//	Create ArrayList
	ArrayList<Food> foodList = new ArrayList<Food>();
	
//	Add Food Methods...
	void add(Food food)
	{
		foodList.add(food);
		System.out.println("Food Added Successfully!!");
	}
	
//	Display Food DisplayMethods...
	void dispalyFood()
	{
//		for Each Loop..
		for (Food food : foodList)
		{
	        food.display();
	    }
	}
	
    // Search Food
    void searchFood(int id)
    {
        for (Food food : foodList) 
        {
            if (food.getId() == id) 
            {
                System.out.println("Food Found!");
                food.display();
                return;
            }
        }

        System.out.println("Food Not Found!");
    }
    
//    Remove Food..
    void removeFood(int id)
     {
    	    for(Food food : foodList)
    	    {
    		   if(food.getId() == id)
    		{
    			foodList.remove(food);
    			System.out.println("Food Removed!!");
    			return;
    		}
    	  }
    	    System.out.println("Food Nhe Mila..");
    }
    
    
//    Update Price..
    void updatePrice(int id, int newPrice)
    {
    		for(Food food : foodList)
    		{
    			if(food.getId() == id)
    			{
    				food.setPrice(newPrice);
    				System.out.println("Price Badh Gya Hai");
    				return;
    			}
    		}
    		
    		System.out.println("Food Not Found..");
    }
    
    
//    Calculate Bill..
    void calculateBill()
    {
    		int total = 0;
    		
    		for(Food food : foodList)
    		{
    			total += food.getPrice();
    		}
    		
    		System.out.println("Total Bill : " + total);
    }

	
    
}
