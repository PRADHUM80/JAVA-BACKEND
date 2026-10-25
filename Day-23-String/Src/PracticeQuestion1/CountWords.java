
package PracticeQuestion1;

import java.util.Scanner;

/**
 * CountWords
 */
public class CountWords {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence .");
        String txt = sc.nextLine();

        txt = txt.trim(); // Remove Sapce From Starting and End.

        /**
         * isEmpty  Then Print -->0.
         * txt.split("\\s+").length ---> Space ,tabs or new line ke addhar pr word ko alag krta hai or .length count krta hai.
         */
        int count = txt.isEmpty() ? 0 : txt.split("\\s+").length;

        System.out.println("Total Words : " + count);
        sc.close();
    }
}