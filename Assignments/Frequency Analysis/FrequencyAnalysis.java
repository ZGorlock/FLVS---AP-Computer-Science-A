import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/**
 * Contains methods to run a frequency analysis
 * 
 * @author Zachary Gill
 * @version 04-12-2013
 */
public class FrequencyAnalysis
{
    private int[] frequency;
    private int total;

    /**
     * Constructor for objects of class FrequencyAnalysis
     */
    public FrequencyAnalysis()
    {
        frequency = new int[26];
    }
    
    /**
     * Returns the frequency array
     * 
     * @return  frequency array
     */
    public int[] getFrequency()
    {
        return frequency;
    }
    
    /**
     * Returns the total number of letters in the plaintext
     * 
     * @return  total
     */
    public int getTotal()
    {
        return total;
    }

    /**
     * Reads a file and stores the frequency of each letter
     * 
     * @param  filename the name of the file to read
     */
    public void readFile(String fileName) throws IOException
    {
        File file = new File(fileName);
        Scanner inFile = new Scanner(file);
        while (inFile.hasNext())
        {
            String token = (inFile.next()).toUpperCase();
            for (int k = 0; k < token.length(); k++)
            {
                char c = token.charAt(k);
                int j = (int) c;
                if (j > 64 && j < 91)
                {
                    frequency[(j - 65)]++;
                    total++;
                }
            }
        }
        inFile.close ( );
    }
}
