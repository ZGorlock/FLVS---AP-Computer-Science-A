/**
 * Shows dice combination probabilities.
 * 
 * Zachary Gill
 * 12-05-2012
 */
 
import java.util.Random;
import java.util.Scanner;
public class DiceProbability
{
    public static void main(String[] args)
    {
        //Declare and initialize variables and objects
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();

        int match = 0;
        int die1 = 0;
        int die2 = 0;
        int diesum = 0;
        double rNum1 = 0.0;
        double rNum2 = 0.0;

        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("Number of Rolls: ");
        int rollsi = in.nextInt();
        double rolls = (double) rollsi;
        System.out.print("Sides on Dice: ");
        int sides = in.nextInt();
        
        //Print heading for output table
        System.out.println("Sum of Dice         Probability");
        
        //Loop to increment through the possible sums of the dice 
        for (int sums = 2; sums <= (sides * 2); sums++)
            {
                match = 0;
                for (int roll = 1; roll <= rolls; roll++)
                    {
                        rNum1 = 1 + (int)(Math.random() * ((sides - 1) + 1));
                        die1 = (int) rNum1;
                        rNum2 = 1 + (int)(Math.random() * ((sides - 1) + 1));
                        die2 = (int) rNum2;
                        diesum = die1 + die2;
                        if (diesum == sums)
                            match += 1;
                    }
                 System.out.println("   " + sums + "s:                " + ((match / rolls) * 100) + "%");
             }
    } //end main
}//end class DiceProbability