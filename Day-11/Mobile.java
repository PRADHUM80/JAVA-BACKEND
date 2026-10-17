// Constructor Chaining...

public class Mobile {
    
    String brand;
    int ram;
    double price;


    public Mobile(String brand)
    {
        this.brand = brand;
    }


    public  Mobile (String brand , int ram)
    {
        this.brand = brand;
        this.ram = ram;
    }


    public Mobile (String brand, int ram, double price)
    {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public  void display()
    {
        System.out.println("Brand  : " + brand);
        System.out.println("Ram : " + ram);
        System.out.println("Price : " + price);
    }

    public static void main(String[] args) {
        
        Mobile phone = new Mobile("Iphone 18");
        phone.display();

        Mobile phone1 = new Mobile("I phone18", 4);
        phone1.display();

        Mobile phone2 = new Mobile("I Phone 18", 4, 71000.00);
        phone2.display();
    }
}
