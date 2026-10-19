package Src.Encapsulation3;

public class Product
{
    
    private double price;

    public Product(double price)
    {
        if(price > 0)
        {
            this.price = price; 
        }

        else{
            System.out.println("Invailed Price..");
        }
    }

    public double getPrice()
    {
        return  price;
    }

}
