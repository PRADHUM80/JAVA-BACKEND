public class Product 
{
//  Public --> Using to Exposed The functionality...
    public void orderService(String itemName, int quantity, int stock, int profit)
    {
        productName(itemName);
        productQuantity(quantity);
        productStock(stock);
        productProfit(profit);
    }

    // Private --> Core Functionality..
    private  boolean productName(String itemName)
    {
        System.out.println("orderService .productName()..." + itemName);
        return  true;
    }

    // Core Functionality...
    private boolean productQuantity(int quantity)
    {
        System.out.println("orderService. productQuantity" + quantity);
        return true;
    }

    // Core Functionality..
    private boolean productStock(int stock)
    {
        System.out.println("orderService. productStock..." + stock);
        return  true;
    }

    // Core Functionality..
    private  boolean productProfit(int profit)
    {
        System.out.println("orderService. productStock..." + profit);
        return true;
    }
}
