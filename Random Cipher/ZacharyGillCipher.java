import java.io.*;
import java.io.IOException;

/**
 * Contains methods to encrypt a message based on a random cipher
 * 
 * @author Zachary Gill
 * @version 04-05-2013
 */
public class ZacharyGillCipher
{
    static int[] cipher = new int[26];
    static String message = "";
    static String encrypted = "";
    
    /**
     * encrypts a message
     */
    public static void encrypt()
    {
        int[] cipher = ZacharyGillCipher.cipher;
        String message = ZacharyGillCipher.message;
        String encrypted = "";
        for (int i = 0; i < message.length(); i++)
        {
            char c = message.charAt(i);
            int j = (int) c;
            if (j > 64 && j < 91)
            {
                encrypted = encrypted + (char) (cipher[(j - 65)] + 65);
            }
            else if (j == 32)
                encrypted = encrypted + " ";
        }
        ZacharyGillCipher.encrypted = encrypted;
    }
    
    /**
     * creates random cipher
     */
    public static void generateRandomCipher()
    {
        int[] cipher = new int[26];
        int pass = 0;
        for (int letter = 0; letter < 26; letter++)
        {
            pass = 0;
            while (pass == 0)
            {
                pass = 1;
                int rand = (int) (Math.random() * 26);
                for (int check = 0; check < letter; check++)
                {
                    if (cipher[check] == rand)
                        pass = 0;
                }
                if (pass == 1)
                    cipher[letter] = rand;
            }
        }
        ZacharyGillCipher.cipher = cipher;
    }
    
    /**
     * writes the encrypted code to a file
     */
    public static void writeToFile() throws IOException
    {
        PrintWriter out = new PrintWriter("encrypted.txt");
        encrypted = ZacharyGillCipher.encrypted;
        out.println(encrypted);
        out.close();
    }
}
