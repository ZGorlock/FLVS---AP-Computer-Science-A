/**
 * Plays a Guessing Game.
 * 
 * Zachary Gill
 * 11-27-2012
 */

import java.util.Scanner;
public class GuessingGame_v2
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int guess = 0;
        int tries = 0;
        int lbound = 0;
        int ubound = 0;
        int setTries = 0;
        
        while (lbound >= ubound)
        {
            if (setTries > 0)
                System.out.println("Make sure your lower bound if below your upper bound!");
            
            setTries += 1;
                
            System.out.print("Enter the lower bound integer of your number set: ");
            lbound = in.nextInt();
            System.out.print("Enter the upper bound integer of your number set: ");
            ubound = in.nextInt();
        }
        
        int boundDif = ubound - lbound;
        double randNum = Math.random();
        randNum = lbound + (randNum * boundDif);
        int rNum = (int) randNum;
        
        while (guess != rNum)
        {
            tries += 1;
            
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            
            if (guess > rNum)
                System.out.println("Too high");
            else if (guess < rNum)
                System.out.println("Too low");
        }
        
        System.out.println("Congratulations!");
        System.out.println("The random number was: " + rNum);
        System.out.println("Number of guesses: " + tries);        
    }
}
