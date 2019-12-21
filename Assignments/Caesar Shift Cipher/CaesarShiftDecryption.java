import java.util.Scanner;
import java.io.IOException;

/**
 * Contains methods to decode a Caesar Shift
 * 
 * @author Zachary Gill
 * @version 04-08-2013
 */
public class CaesarShiftDecryption
{
    static String message = "";
    static String decrypted = "";
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
            lettertmp = ((alphabet[letter] - 65) + CaesarShiftDecryption.key);
            lettertmp = lettertmp % 26;
            CaesarShiftDecryption.cryptalphabet[letter] = lettertmp + 65;
        }
    }

    /**
     * decrypts a message
     */
    public static void decrypt()
    {
        int[] cryptalphabet = CaesarShiftDecryption.cryptalphabet;
        String message = CaesarShiftDecryption.message;
        String decrypted = "";
        for (int i = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            int j = (int) c;
            if (j > 64 && j < 91)
            {
                for (int k = 0; k < 26; k++)
                {
                    if (cryptalphabet[k] == j)
                    {
                       int l = ((j - 65) - CaesarShiftDecryption.key) % 26;
                       while (l < 0)
                            l = l + 26;
                        decrypted = decrypted + (char) alphabet[l];
                    }
                }
            }
            else if (j == 32)
                decrypted = decrypted + " ";
        }
        CaesarShiftDecryption.decrypted = decrypted;
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
        CaesarShiftDecryption.key = key;
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
