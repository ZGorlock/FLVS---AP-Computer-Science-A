/**
 * Displays gravity and weight for each planet.
 * 
 * Zachary Gill
 * 01-10-2013
 */

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class WeightOnPlanetsV1
{
    //reads file
    public static double[] readFileDouble(Scanner scan, double[] output)
    {
        int k = 0;
        
        while (scan.hasNext())
        {
            output[k] = scan.nextDouble();
            k++;
        }
        scan.close();
        
        return output;
    }
    
    //finds weight from x gravity based on x mass
    public static double weightFromGravity(double m, double g)
    {
        return m * g;
    }
    
    //main method
    public static void main(String[] args) throws IOException
    {
        //objects
        File file = new File("gravity1.txt");
        Scanner inFile = new Scanner(file);
        
        //variables
        int k = 0;
        double weightEarth = 115;
        
        //define arrays
        double[] g = new double[9];
        double[] weight = new double[9];
        String[] planet = {"Mercury", "Venus  ", "Earth  ", "Mars   ", "Jupiter", "Saturn ", "Uranus ", "Neptune", "Pluto  "};
        
        //read file
        g = readFileDouble(inFile, g);
        
        //math
        for (int index = 0; index <= 8; index ++)
            weight[index] = weightFromGravity(weightEarth, g[index]);
        
        //output
        System.out.printf("%10s%s%n", "", "My Weight on the Planets");
        System.out.printf("%2s%-16s%s%16s%n", "", "Planet", "Gravity", "Weight(lbs)");
        System.out.println("------------------------------------------");
        for (int display = 0; display <= 8; display ++)
            System.out.printf("%2s%-16s%6.2f%16.2f%n", "", planet[display], g[display], weight[display]);
        System.out.println("------------------------------------------");
    }
}