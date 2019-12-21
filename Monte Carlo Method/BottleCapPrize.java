/**
 * Shows number of bottles needed to drink before winning a prize.
 * 
 * Zachary Gill
 * 12-05-2012
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class BottleCapPrize
{
    public static void main(String[] args) throws IOException
    {
        //objects
        PrintWriter outFile = new PrintWriter (new File("bottlecap.txt"));
        File fileName = new File("bottlecap.txt");
        Scanner in = new Scanner(System.in);
        Scanner inFile = new Scanner(fileName);
        Random randNum = new Random();        
        
        //variables
        int average = 0;
        int count = 0;
        int rNum = 0;
        int sum = 0;
        int token = 0;
        
        //user input
        System.out.print("Number of Trials: ");
        int trials = in.nextInt();
        
        //loop
        for (int k = 1; k <= trials; k ++)
            {
                count = 0;
                rNum = 0;
                while (rNum != 1)
                {
                    if (rNum != 6)
                        count ++;
                    rNum = 1 + (int)(Math.random() * 6);
                }
                outFile.println(count);
            }
        outFile.close ( );
        
        //read file
        while (inFile.hasNext())
        {
            token = inFile.nextInt();
            sum = sum + token;
        }
        inFile.close ( );
        
        //average
        average = (int) (sum / trials);
        
        //output
        System.out.println("The average number of drinks needed is: " + average);
    } //end main
}//end class