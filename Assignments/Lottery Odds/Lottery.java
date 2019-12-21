/**
 * Picks a random number and tells if the user correctly guesses it.
 * 
 * Zachary Gill
 * 12-05-2012
 */
 
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args)
    {
        //declare and initialized variables and objects
        Scanner input = new Scanner(System.in);
        
        String lotteryNum = "";        
        double randNum = 0.0;
        int rNum = 0;
        
        //Generate a 3-digit "lottery" number composed of random numbers
        for (int a = 0; a <= 2; a++)
            {
                randNum = Math.random();
                rNum = (int) (randNum * 10);
                lotteryNum = lotteryNum + Integer.toString(rNum);
            }
        
        //Input: Ask user to guess 3 digit number
        System.out.print("Guess a 3-digit number: ");
        int userGuess = input.nextInt();
        String guess = Integer.toString(userGuess);
        
        //Compare the user's guess to the lottery number and report results
        System.out.println("   Winner: " + lotteryNum);
        if (guess.equals(lotteryNum))
            System.out.println("   Congratulations! Both pairs matched!");
        else if ((guess.substring(0, 2)).equals((lotteryNum.substring(0, 2))))
            System.out.println("   Congratulations! The front pair matched.");
        else if ((guess.substring(1, 3)).equals((lotteryNum.substring(1, 3))))
            System.out.println("   Congratulations! The end pair matched.");
        else
            System.out.println("   Sorry, no matches.");
    } //end main
}//end class Lottery