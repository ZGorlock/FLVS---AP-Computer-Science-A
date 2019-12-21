import java.util.Scanner;
import java.io.IOException;

/**
 * uses methods from the classes ZacharyGillCipher and ZacharyGillDecipher to encrypt and decrypt a message based on a random cipher
 * 
 * @author Zachary Gill
 * @version 04-05-2013
 */
public class ZacharyGillTester
{
    /**
     * main method for ZacharyGillTester
     */
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        
        ZacharyGillCipher.generateRandomCipher();
        System.out.print("Enter a plaintext message: ");
        ZacharyGillCipher.message = (in.nextLine()).toUpperCase();
        System.out.println();
        ZacharyGillCipher.encrypt();
        System.out.println(ZacharyGillCipher.message);
        System.out.println(ZacharyGillCipher.encrypted);
        ZacharyGillCipher.writeToFile();
        ZacharyGillDecipher.readFile();
        ZacharyGillDecipher.decrypt();
        System.out.println(ZacharyGillDecipher.decrypted);
    }
}
