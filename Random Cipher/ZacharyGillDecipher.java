import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Contains methods to decrypt a message based on a random cipher
 * 
 * @author Zachary Gill
 * @version 04-05-2013
 */
public class ZacharyGillDecipher
{
    static String decrypted = "";
    static String encrypted = "";

    /**
     * decrypts a message
     */
    public static void decrypt()
    {
        int[] cipher = ZacharyGillCipher.cipher;
        String encrypted = ZacharyGillDecipher.encrypted;
        String decrypted = "";
        for (int i = 0; i < encrypted.length(); i++)
        {
            char c = encrypted.charAt(i);
            int j = (int) c;
            if (j > 64 && j < 91)
            {
                for (int k = 0; k < 26; k++)
                    if (cipher[k] == (j - 65))
                        decrypted = decrypted + (char) (k + 65);
            }
            else if (j == 32)
                decrypted = decrypted + " ";
        }
        ZacharyGillDecipher.decrypted = decrypted;
    }
    
    /**
     * reads the encrypted code from a file
     */
    public static void readFile() throws IOException
    {
        File fileName = new File("encrypted.txt");
        Scanner inFile = new Scanner(fileName);
        encrypted = inFile.nextLine();
        inFile.close();
        ZacharyGillDecipher.encrypted = encrypted;
    }
}
