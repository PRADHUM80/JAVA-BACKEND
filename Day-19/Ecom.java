import java.util.Scanner;

public class Ecom {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount : ");
        int amount = sc.nextInt();


        sc.nextLine();

        System.out.println("Customer type");
        String customerType = sc.nextLine();

        Ecom e = new Ecom();
        e.discountApply(customerType, amount);
    }

    public void discountApply(String customerType, int amount)
    {
        if(amount <= 1000)
        {
            System.out.println("Minimum Purchase shall be above 1000");
            return ;
        }

        double discount = 0;

        switch (customerType) {
            case "Gold":
                discount = amount * 20 / 100.0;
                break;
                case "Silver" :
                    discount = amount * 10 / 100.0;
                    break;
                    case "Regular" :
                        discount = amount * 5 / 100.0;
                        break;
        
            default:
                    System.out.println("Ivailed Type : ");
                    break;

        }

        if (discount > 2500)
        {
            discount = 2500;
        }

        System.out.println("customerType " + customerType);
        System.out.println("amount " + amount);
        System.out.println("discount " + discount);
        System.out.println("final Amount  " + (amount - discount));
    }
}
