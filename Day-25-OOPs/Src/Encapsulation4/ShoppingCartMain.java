package Src.Encapsulation4;

public class ShoppingCartMain 
{

    public static void main(String[] args) {
        
        ShoppingCart cart = new ShoppingCart();
        cart.setAddItems(200.0);
        cart.setAddItems(300.0);
        cart.setAddItems(500.0);

        System.out.println(cart.getPrice());
    }
}
