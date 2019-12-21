/**
 * Displays the average category, pressure, and wind speed of all Atlantic Hurricanes from 1980-2006.
 * 
 * Zachary Gill
 * 01-04-2013
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class Hurricanes2
{
    public static void main(String[] args) throws IOException
    {
        //objects
        PrintWriter outFile = new PrintWriter (new File("Summary.txt"));
        File file = new File("hurcdata2.txt");
        Scanner in = new Scanner(System.in);
        Scanner inFile = new Scanner(file);
        
        //variables
        int k = 0;
        int categorySum = 0;
        int max = 59;
        int maxCategory = 0;
        int maxPressure = Integer.MIN_VALUE;
        int maxSpeed = Integer.MIN_VALUE;
        int minCategory = 0;
        int minPressure = Integer.MAX_VALUE;
        int minSpeed = Integer.MAX_VALUE;
        int onlyOnce = 0;
        int pressureSum = 0;
        int testyear = 0;
        double categoryAvg = 0.0;
        double ktToMph = 1.15078;
        double pressureAvg = 0.0;
        double speedAvg = 0.0;
        double speedSum = 0;
        
        //arrays
        int[] cat = new int[max];
        int[] category = new int[5];
        int[] pressure = new int[max];
        int[] speed = new int[max];
        int[] year = new int[max];
        String[] hurricane = new String[max];
        String[] month = new String[max];
                
        //read file
        for (int counter = 0; counter <= (max - 1); counter++)
        {
            year[counter] = inFile.nextInt();
            month[counter] = inFile.next();
            pressure[counter] = inFile.nextInt();
            speed[counter] = inFile.nextInt();
            hurricane[counter] = inFile.next();
        }
        inFile.close();
        
        //loops
        for (int pres : pressure)
        {
            pressureSum = pressureSum + pres;
            if (pres < minPressure)
                minPressure = pres;
            if (pres > maxPressure)
                maxPressure = pres;
        }
        for (int spdk = 0; spdk <= (max - 1); spdk++)
        {
            speed[spdk] = (int) (speed[spdk] * ktToMph);
            speedSum = speedSum + speed[spdk];
        }
        for (int spd = 0; spd <= (max - 1); spd++)
        {
            if (speed[spd] <= 95)
            {
                category[0]++;
                cat[spd] = 1;
            }
            else if (speed[spd] <= 110)
            {
                category[1]++;
                cat[spd] = 2;
            }
            else if (speed[spd] <= 129)
            {
                category[2]++;
                cat[spd] = 3;
            }
            else if (speed[spd] <= 156)
            {
                category[3]++;
                cat[spd] = 4;
            }
            else if (speed[spd] > 157)
            {
                category[4]++;
                cat[spd] = 5;
            }
            if (speed[spd] < minSpeed)
                minSpeed = (int) speed[spd];
            if (speed[spd] > maxSpeed)
                maxSpeed = (int) speed[spd];
        }
        for (int cats = 0; cats <= 4; cats++)
        {
            categorySum = categorySum + ((cats + 1) * category[cats]);
            if (minCategory == 0 && category[cats] != 0)
                minCategory = (cats + 1);
            if (category[cats] != 0)
                maxCategory = (cats + 1);
        }
        
        //math
        pressureAvg = pressureSum / max;
        speedAvg = speedSum / max;
        categoryAvg = categorySum / max;
        
        //write file
        outFile.printf("%19s%s%n", "", "Hurricances 1980 - 2006");
        outFile.printf("%-10s%-16s%-16s%-16s%n", "", "Category", "Pressure (mb)", "Wind Speed (mph)");
        outFile.printf("%-10s%-16.0f%-16.0f%-16.0f%n", "Average", categoryAvg, pressureAvg, speedAvg);
        outFile.printf("%-10s%-16d%-16d%-16d%n", "Maximum", maxCategory, maxPressure, maxSpeed);
        outFile.printf("%-10s%-16d%-16d%-16d%n", "Minumum", minCategory, minPressure, minSpeed);
        outFile.println();
        for (int catDisp = 0; catDisp <= 4; catDisp++)
            outFile.printf("%s%d%s%3d%n", "Number of Category ", (catDisp + 1), ":", category[catDisp]);
        outFile.close();
        
        //output
        System.out.printf("%25s%s%n", "", "Hurricances 1980 - 2006");
        System.out.printf("%-8s%-16s%-16s%-16s%-16s%n", "Year", "Hurricane", "Category", "Pressure (mb)", "Wind Speed (mph)");
        System.out.println("========================================================================");
        for (int disp = 0; disp <= (max - 1); disp++)
            System.out.printf("%-8d%-16s%-16d%-16d%-16d%n", year[disp], hurricane[disp], cat[disp], pressure[disp], speed[disp]);
        System.out.println("========================================================================");
        System.out.printf("%-24s%-16.0f%-16.0f%-16.0f%n", "Average", categoryAvg, pressureAvg, speedAvg);
        System.out.printf("%-24s%-16d%-16d%-16d%n", "Maximum", maxCategory, maxPressure, maxSpeed);
        System.out.printf("%-24s%-16d%-16d%-16d%n", "Minumum", minCategory, minPressure, minSpeed);
        System.out.println();
        for (int catDisp = 0; catDisp <= 4; catDisp++)
            System.out.printf("%s%d%s%3d%n", "Number of Category ", (catDisp + 1), ":", category[catDisp]);
    }
}