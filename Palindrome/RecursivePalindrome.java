/**
 * determines if word is a palindrome or not
 * 
 * Zachary Gill
 * 02-20-2013
 */
public class RecursivePalindrome
{
    private String word = "";

    /**
     * Constructor for objects of class RecursivePalindrome
     */
    public RecursivePalindrome()
    {
        word = "";
    }

    /**
     * Mutator method to calculate whether the word is a palindrome or not
     * 
     * @param word the word to test if it is a palindrome
     * 
     * @return the boolean if a word is a palindrome or not
     */
    public boolean isPalindrome(String word)
    {
        boolean isPalindrome = true;
        if (word.length() > 1)
        {
            if (word.substring(0, 1).equalsIgnoreCase(word.substring((word.length() - 1))))
                isPalindrome = isPalindrome(word.substring(1, (word.length() - 1)));
            else
                return false;
            return true;
        }
        else
            return true;
    }
}
