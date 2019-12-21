/**
 * Generates random passwords.
 * 
 * Zachary Gill
 * 12-19-2012
 */

import java.util.Random;
import java.util.Scanner;

public class Password
{
    public static void main(String[] args)
    {
        //objects
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();        
        
        //variables
        int ascii = 0;
        int rNum = 0;
        char character = ' ';
        String password = "";

        //display
        System.out.println("                Password Generation Menu");
        System.out.println("**********************************************************");
        System.out.println("*   [1] Lowercase Letters                                *");
        System.out.println("*   [2] Lowercase Letters & Uppercase Letters            *");
        System.out.println("*   [3] Lowercase, Uppercase, and Numbers                *");
        System.out.println("*   [4] Lowercase, Uppercase, Numbers, and Punctuation   *");
        System.out.println("*   [5] Quit                                             *");
        System.out.println("**********************************************************");
                
        //user input
        System.out.print("Enter Selection (1-5): ");
        int menu = in.nextInt();
        if (menu < 5 && menu > 0)
        {
            System.out.println("");
            System.out.print("Password Length (1-14): ");
            int length = in.nextInt();
        
            //loop
            for (int k = 1; k <= length; k++)
            {
                if (menu == 1)
                    ascii = 97 + (int) (Math.random() * 25);
                else if (menu == 2)
                {
                    rNum = 1 + (int) (Math.random() * 2);
                    if (rNum == 1)
                        ascii = 65 + (int) (Math.random() * 25);
                    else if (rNum == 2)
                        ascii = 97 + (int) (Math.random() * 25);
                }
                else if (menu == 3)
                {
                    rNum = 1 + (int) (Math.random() * 3);
                    if (rNum == 1)
                        ascii = 65 + (int) (Math.random() * 25);
                    else if (rNum == 2)
                        ascii = 97 + (int) (Math.random() * 25);
                    else if (rNum == 3)
                        ascii = 48 + (int) (Math.random() * 10);
                }
                else if (menu == 4)
                    ascii = 48 + (int) (Math.random() * 78);
                character = (char) ascii;
                password = password + Character.toString(character);
            }
        
            //output
            System.out.println("");
            System.out.println("Password: " + password);
        }
    } //end main
}//end class