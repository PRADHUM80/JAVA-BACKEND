package Src.Encapsulation4;

public class ShoppingCart 
{
    
    private  double totalAmount =0;

    public  void setAddItems(double price)
    {
        if(price > 0) 
        {
            totalAmount =  totalAmount + price;
        }
         else{
            System.out.println("Invaioled Add Items");
         }
    }

    public double getPrice()
    {
        return  totalAmount;
    }

}
