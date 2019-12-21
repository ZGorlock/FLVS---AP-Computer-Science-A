import java.util.Scanner;
import java.io.IOException;

/**
 * Contains methods to create a Caesar Shift
 * 
 * @author Zachary Gill
 * @version 04-08-2013
 */
public class CaesarShiftEncryption
{
    static String message = "";
    static String encrypted = "";
    static int key = 0;
    static final int[] alphabet = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90};
    static int[] cryptalphabet = new int[26];

    /**
     * creates the alphabet based on the shift key
     */
    public static void createAlphabet()
    {
        for (int letter = 0; letter < 26; letter++)
        {
            int lettertmp = 0;
            lettertmp = ((alphabet[letter] - 65) + CaesarShiftEncryption.key);
            lettertmp = lettertmp % 26;
            CaesarShiftEncryption.cryptalphabet[letter] = lettertmp + 65;
        }
    }
    
    /**
     * encrypts a message
     */
    public static void encrypt()
    {
        int[] cryptalphabet = CaesarShiftEncryption.cryptalphabet;
        String message = CaesarShiftEncryption.message;
        String encrypted = "";
        for (int i = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            int j = (int) c;
            if (j > 64 && j < 91)
            {
                encrypted = encrypted + (char) (cryptalphabet[(j - 65)]);
            }
            else if (j == 32)
                encrypted = encrypted + " ";
        }
        CaesarShiftEncryption.encrypted = encrypted;
    }
    
    /**
     * Allows the user to enter a shift key
     */
    public static void enterKey()
    {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a shift key: ");
        int key = in.nextInt();
        key = key % 26;
        CaesarShiftEncryption.key = key;
    }
    
    /**
     * Prints the cryptalphabet to the screen
     */
    public static void printAlphabet()
    {
        for (int letter : cryptalphabet)
            System.out.print((char) letter);
        System.out.print("\n");
    }
}
