public class Break2 {
    
    public static void main(String[] args) {
        
        int number = 10;

        for(int i = 1; i <= number ; i++)
        {
            if(i == 6)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
