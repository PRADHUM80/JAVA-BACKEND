// Constructor...

class Products
{
    String prdouctsName;
    double price;

    public  Products()
    {
        System.out.println("Unkonwn");
        System.out.println("0.0");
    }

    public Products(String productName, double price)
    {
        this.prdouctsName = productName;
        this.price = price;
    }

    public void display()
    {
        System.out.println("Products : " + prdouctsName);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        
        Products p = new Products();

        Products p1 = new Products("Laptop", 55000.0);
        p1.display();
        p.display();
    }
}
