public class Break1 {
    
    public static void main(String[] args) {
        
        String[] cities = {"Locknow", "Patna", "Mumbai", "Patna", "Delhi", "KolKata", "Patna"};

        for(int i = 0; i < cities.length; i++)
        {
            String currentCity = cities[i];
            if(currentCity.equals("Patna"))
            {
                System.out.println("Patana Is The PArt Of City ..");
                break;
            }
        }
    }
}
