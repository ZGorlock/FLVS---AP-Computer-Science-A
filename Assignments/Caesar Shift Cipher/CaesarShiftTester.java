import java.util.Scanner;
import java.io.IOException;

/**
 * uses methods in the class CaesarShiftEncryption to create a Caesar Shift
 * 
 * @author Zachary Gill
 * @version 04-08-2013
 */
public class CaesarShiftTester
{
    /**
     * main method for CaesarShiftTester
     */
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        while (choice != 2)
        {            
            System.out.println("Choose a menu option-");
            System.out.println("0-Encryption");
            System.out.println("1-Decryption");
            System.out.println("2-Quit");
            System.out.print(": ");
            choice = in.nextInt();
            if (choice < 2 && choice > -1)
            {
                if (choice == 0)
                {
                    CaesarShiftEncryption.enterKey();
                    CaesarShiftEncryption.createAlphabet();
                    CaesarShiftEncryption.printAlphabet();
                    System.out.print("Enter a plaintext message to encrypt: ");
                    while (CaesarShiftEncryption.message.equals(""))
                        CaesarShiftEncryption.message = (in.nextLine()).toUpperCase();
                    System.out.println();
                    CaesarShiftEncryption.encrypt();
                    System.out.println(CaesarShiftEncryption.message);
                    System.out.println(CaesarShiftEncryption.encrypted);
                }
                else
                {
                    CaesarShiftDecryption.enterKey();
                    CaesarShiftDecryption.createAlphabet();
                    CaesarShiftDecryption.printAlphabet();
                    System.out.print("Enter a plaintext message to decrypt: ");;
                    while (CaesarShiftDecryption.message.equals(""))
                        CaesarShiftDecryption.message = (in.nextLine()).toUpperCase();
                    System.out.println();
                    CaesarShiftDecryption.decrypt();
                    System.out.println(CaesarShiftDecryption.message);
                    System.out.println(CaesarShiftDecryption.decrypted);
                }
                System.out.println();
                CaesarShiftEncryption.message = "";
                CaesarShiftDecryption.message = "";
            }
        }
    }
}
