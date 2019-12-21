import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

/**
 * Uses methods from FrequencyAnalysis to fun a frequency analysis
 * 
 * @author Zachary Gill
 * @version 04-12-2013
 */
public class FrequencyAnalysisTester
{
    /**
     * main method for FrequencyAnalysisTester
     */
    public static void main(String [] args) throws IOException
    {
        System.out.println("PLAINTEXT FREQUENCY");
        
        FrequencyAnalysis fa = new FrequencyAnalysis();        
        PrintWriter outFile1 = new PrintWriter (new File("plaintextfreq.txt"));        
        fa.readFile("plaintext.txt");        
        int total1 = fa.getTotal();
        System.out.printf("%-10s%11s%16s%n", "Letter", "Count", "Frequency");
        outFile1.printf("%-10s%11s%16s%n", "Letter", "Count", "Frequency");
        int l = 0;
        for (int k : fa.getFrequency())
        {
            System.out.printf("%-10s%10d%16.2f%n", (char) (65 + l), k, (((double) k / total1) * 100));
            outFile1.printf("%-10s%10d%16.2f%n", (char) (65 + l), k, (((double) k / total1) * 100));
            l++;
        }
        outFile1.close();
        
        System.out.println();
        System.out.println();
        System.out.println("CIPHER FREQUENCY");
        
        FrequencyAnalysis cfa = new FrequencyAnalysis();        
        PrintWriter outFile2 = new PrintWriter (new File("ciphertextfreq.txt"));        
        cfa.readFile("ciphertext.txt");        
        int total2 = cfa.getTotal();
        System.out.printf("%-10s%11s%16s%n", "Letter", "Count", "Frequency");
        outFile2.printf("%-10s%11s%16s%n", "Letter", "Count", "Frequency");
        l = 0;
        for (int k : cfa.getFrequency())
        {
            System.out.printf("%-10s%10d%16.2f%n", (char) (65 + l), k, (((double) k / total2) * 100));
            outFile2.printf("%-10s%10d%16.2f%n", (char) (65 + l), k, (((double) k / total2) * 100));
            l++;
        }
        outFile2.close();
        
        
    }
}
