/**
 * Finds the durface gravity of the planets.
 * 
 * Zachary Gill
 * 01-10-2013
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class GravityV1
{
    public static void main(String [] args) throws IOException
    {
        //objects
        PrintWriter outFile = new PrintWriter (new File("gravity1.txt"));

        //variables
        double printg = 0.0;
        double ugc = 0.0000000000667;
        
        //define arrays
        double[] m = {3.30e23, 4.869e24, 5.97219e24, 6.4219e23, 1.900e27, 5.68e26, 8.683e25, 1.0247e26, 1.27e22};
        double[] d = {4880, 12104, 12756, 6794, 142984, 120536, 51118, 49532, 2274};        
        double[] g = new double[9];
        String[] planet = {"Mercury", "Venus  ", "Earth  ", "Mars   ", "Jupiter", "Saturn ", "Uranus ", "Neptune", "Pluto  "};
        
        //find earth gravity
        double ge = (ugc * m[2]) / (Math.pow(((d[2] * 1000) / 2), 2));
        
        //math
        for (int x = 0; x <= 8; x++)
            g[x] = (ugc * m[x]) / (Math.pow(((d[x] * 1000) / 2), 2));
        
        //loops
        for (double sg : g)
        {
            printg = sg / ge;
            outFile.println(printg);
        }
        outFile.close();
        
        //output
        System.out.printf("%17s%s%n", "", "Planetary Data");
        System.out.printf("%2s%-12s%12s%12s%12s%n", "", "Planet", "Diameter (km)", "Mass (kg)", "g (m/s^2)");
        System.out.println("-----------------------------------------------------");
        for (int display = 0; display <= 8; display++)
            System.out.printf("%2s%-12s%12.2f%12.2e%12.2f%n", "", planet[display], d[display], m[display], g[display]);
        System.out.println("------------------------------------------------------");
    }
}
