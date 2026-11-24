package comArrayList.FoodDelivery.project;

/**
 * Why Use Encapsulation..
 * private protects the data.
   Getters access the data.
   Setter updates the price.
 */
public class Food 
{
	private int id;
	private String name;
	private int price;
	
//	Constructor...
	public Food(int id, String name, int price) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

//	Getters ANd Setters Methods..
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	// For Display Total..
	public void display() 
    {
        System.out.println(id + " | " + name + " | ₹" + price);
    }

	
	
}
