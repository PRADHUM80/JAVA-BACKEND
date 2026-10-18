import java.util.Scanner;

public class FilipKart {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
// Eneter Amount..
        System.out.println("Enter Amount : ");
        int amount = sc.nextInt();

        sc.nextLine(); // NextLine Consume..

        System.out.println("Enter Customer Type :");
        String coustomerType = sc.nextLine();

        FilipKart cart = new FilipKart();
        cart.discountApply(coustomerType, amount);

    }

    public  void discountApply(String customerType, int amount)
    {
        if(amount <= 1000)
        {
            System.err.println("Minimum Purchase Should be able above 1000.");
            return ;
        }
        double discount = 0.0;

        switch (customerType) {
            case "Plus Member":
                discount = amount * 20 / 100; 
                break;

                case "Plus" :
                    discount = amount * 10/100;
                    break;

                    case "Regular" :
                        discount = amount * 5/ 100;
                        break;
        
            default:
                System.err.println("Invailed Type ..");
                break;
        }

        if(discount > 2500) // Maximum Discount..
        {
            discount = 2500;
        }
        System.out.println("Customer Type : " + customerType);
        System.out.println("Amount : " + amount);
        System.out.println("Discount : " + discount);
        System.out.println("Final Amount : " + (amount - discount) );
    }
}
