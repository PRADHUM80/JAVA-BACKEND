package PracticeQuestion1;

import java.util.Scanner;

public class CountVowelOrCons {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Text : ");
        String txt = sc.nextLine();

        int vowel = 0;
        int cons = 0;

        for(int i = 0; i < txt.length(); i++)
        {
            // ch --> chartecr check ek -ek words. here 
            char ch = txt.charAt(i);

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowel ++;
                }
                else
                {
                    cons ++;
                }
            }
        }

        System.out.println("Vowels : " + vowel);
        System.out.println("Consonent : " + cons);
        sc.close();
    }
}
