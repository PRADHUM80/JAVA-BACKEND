package comArrayList.FoodDelivery.project;

public class FoodMain {

	public static void main(String[] args) 
	{
		FoodManagementSystem fms = new FoodManagementSystem();
		
		fms.add(new Food(1, "Pizza", 350));
		
		fms.add(new Food(2, "Burger", 99));
		
		fms.add(new Food(3, "Briyani", 440));
		
		System.out.println("---- All Food items -----");
		fms.dispalyFood();
		
		System.out.println("----- Search Food ---- ");
		fms.searchFood(2);
		
		System.out.println("------ Upadate Price ----- ");
		fms.updatePrice(1, 650);
		
		System.out.println("----- Remove Food ----- ");
		fms.removeFood(2);
		
		System.out.println("---- Final Food List ----- ");
		fms.dispalyFood();
		
		System.out.println("---- Total Bill ---- ");
		fms.calculateBill();
		
		
	}

}
