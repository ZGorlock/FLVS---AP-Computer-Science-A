/**
 * Approximates Pi using random numbers.
 * 
 * Zachary Gill
 * 01-10-2013
 */

import java.util.Scanner;

public class Darts
{    
    //returns if a value is in range
    public static int inRange(double x, double y, double r)
    {
        int in = 0;
        double range = (Math.pow(x, 2) + Math.pow(y, 2));
        if (range <= r)
            in = -1;
        else
            in = 0;
        return in;
    }
    
    //estimates pi
    public static double estimatePi(double ins, int total)
    {
        double pi = 4 * (ins / total);
        return pi;
    }
    
    //averages pi estimates
    public static double getAvgPi(double[] guess, int trials)
    {
        double total = 0.0;
        for (double est : guess)
            total = total + est;
        double pi = total / trials;
        return pi;
    }
    
    //main method
    public static void main(String[] args)
    {
        //objects
        Scanner in = new Scanner(System.in);
        
        //variables
        int k = 0;
        double avg = 0.0;
        double total = 0.0;
        double range = 0.0;
        double x = 0.0;
        double y = 0.0;
        
        //user input
        System.out.print("Number of Trials: ");
        int trials = in.nextInt();
        System.out.print("Darts per Trials: ");
        int darts = in.nextInt();
        
        //define arrays
        double[] guess = new double[trials];
                
        //math
        for (int trial = 0; trial <= (trials - 1); trial++)
        {
            for (int dart = 0; dart <= (darts - 1); dart++)
            {
                x = (-1 + (Math.random() * 2));
                y = (-1 + (Math.random() * 2));
                if (inRange(x, y, 1) == -1)
                    guess[trial] = guess[trial] + 1;
            }
            guess[trial] = estimatePi(guess[trial], darts);
        }
        avg = getAvgPi(guess, trials);  
        
        //output
        System.out.println();
        System.out.printf("%6s%s%n", "", "Estimating Pi");
        System.out.println("-------------------------");
        for (int display = 0; display <= (trials - 1); display ++)
            System.out.printf("%s%d%s%.6f%n", "Trial [", display, "]: pi = ", guess[display]);
        System.out.printf("%s%.6f%n", "Estimate of pi = ",avg);
        System.out.println("-------------------------");
    }
}