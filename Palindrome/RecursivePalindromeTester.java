import java.util.Scanner;
/**
 * determines if the input entered by the user is a palindrome or not
 * Zachary Gill
 * 02-20-2013
 */
public class RecursivePalindromeTester
{
    /**
     * the main method for the RecursivePalindromeTester class
     */    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        RecursivePalindrome palindrome = new RecursivePalindrome();
        
        boolean isPalindrome = true;
        
        String word = "";
        
        System.out.println("Enter a word to determine if it is a palindrome.");
        System.out.println("Enter 'q' to exit the program.");
        
        while (!(word.equalsIgnoreCase("q")))
        {
            System.out.print(": ");
            word = in.next();
            if (word.equalsIgnoreCase("q"))
                System.out.println("Terminating program.");
            else if (word.length() > 0)
            {
                isPalindrome = palindrome.isPalindrome(word);
                if (isPalindrome == true)
                    System.out.println("The word you entered is a palindrome.");
                else
                    System.out.println("The word you entered is not a palindrome");
            }
            else
                System.out.println("Please enter a word.");
        }
    }
}
