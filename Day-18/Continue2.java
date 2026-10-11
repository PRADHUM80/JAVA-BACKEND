public class Continue2 {
    public static void main(String[] args) {
        
        int number[] = {10, -25, 35, -40, 55, -60, 75, -80, 95, -100, -30, 45, 65, -70, 85, 90, 20, -35};

        for(int i = 0; i < number.length; i++)
        {
            int currentNumber = number[i];
            if(currentNumber < 0)
            {
                continue;
            }
            System.out.println(currentNumber * 10);
        }
    }
}
