import java.io.IOException;

/**
 * Uses methods in the class MorseCode to convert a message to morse code.
 * 
 * @author Zachary Gill
 * @version 04-05-2013
 */
public class MorseCodeTester
{
    /**
     * main method for MorseCodeTester
     */
    public static void main(String [] args) throws IOException
    {
        MorseCode.readFile();
        MorseCode.enterMessage();
        MorseCode.convertMessage();
        MorseCode.printMessage();
    }
}
