




public class Array3 {

    public static void main(String[] args) {
        
        String cities[] = new String[5];
        cities[0] = "Bangalore";
        cities[1] = "Bhubaneswar";
        cities[2] = "Bihar";
        cities[3] = "Chennai";
        cities[4] = "Delhi";

        for(int i = 0; i< cities.length; i++)
        {
            if(cities[i].startsWith("B"))
            {
            System.out.println("Cities Staring Letters is : " + cities[i]);
            }
        }
    }
    
}
