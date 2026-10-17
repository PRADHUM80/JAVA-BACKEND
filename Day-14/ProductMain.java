
class Product {

    String name;
    int price;
    String productId;

    Product(String name, int price, String productId)
    {
        this.name = name;
        this.price = price;
        this.productId = productId;

    }
}

class ElectronicProduct extends  Product{
    int warranty;

    public  ElectronicProduct(String name, int price, String productId, int warranty)
    {
        //Default field....
        super(name, price, productId);
        this.warranty = warranty;
    }
}

public class ProductMain {
    
    public static void main(String[] args) {
        
        ElectronicProduct product = new ElectronicProduct("I Phone", 60000, "Iphone 18", 2);

        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.productId);
        System.out.println(product.warranty);
    }
}
