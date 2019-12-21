import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Contains methods to convert a message to morse code.
 * 
 * @author Zachary Gill
 * @version 04-05-2013
 */
public class MorseCode
{
    static String [] alphabet = new String[36];
    static String message = "";
    static String code = "";
    
    /**
     * converts message to morse code
     */
    public static void convertMessage()
    {
        String message = MorseCode.message;
        message = message.toUpperCase();
        for (int i = 0; i < message.length(); ++i)
        {
            char c = message.charAt(i);
            int j = (int) c;
            if (j > 64 && j < 91)
                MorseCode.code = MorseCode.code + MorseCode.alphabet[(j - 65)] + " ";
            else if (j > 47 && j < 58)
                MorseCode.code = MorseCode.code + MorseCode.alphabet[(j - 22)] + " ";
        }
    }

    /**
     * recieves a message from the user
     */
    public static void enterMessage()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a message without punctuation");
        System.out.print(": ");
        MorseCode.message = in.nextLine();
    }
    
    /**
     * prints morse code
     */
    public static void printMessage()
    {
        String code = MorseCode.code;
        System.out.println(code);
    }
    
    /**
     * reads the morse code file
     */
    public static void readFile() throws IOException
    {
        int k = 0;
        File fileName = new File("morsecode.txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNext())
        {
            alphabet[k] = inFile.next();
            k++;
        }
        inFile.close();
    }
}
