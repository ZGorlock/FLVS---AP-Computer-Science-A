/**
 * Plays a Guessing Game.
 * 
 * Zachary Gill
 * 11-27-2012
 */

import java.util.Scanner;
public class GuessingGame_v1
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int guess = 0;
        int tries = 0;
        
        double randNum = Math.random();
        randNum = randNum * 100;
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
