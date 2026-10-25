package PracticeQuestion1;

import java.util.Scanner;

public class CountChar {
    
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter a Character : ");
        String txt = sc.nextLine().toLowerCase();

        boolean[] visited =  new boolean[txt.length()];


        for(int i = 0; i < txt.length(); i++)
        {
            // choose Single Character...
            char ch = txt.charAt(i);

            if(visited[i] || ch == ' ')
            {
                continue;
            }

            int count = 1;

            for(int j = i + 1; j < txt.length(); j++)
            {
                // check Repat or count the character..
                if(ch == txt.charAt(j))
                {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(ch + " Count is  : " + count);
        }
        sc.close();;
    }
}
