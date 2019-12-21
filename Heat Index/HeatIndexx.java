
/**
 * Calculates the monthly Heat Index for Key West, Florida.
 * 
 * Zachary Gill
 * 01-01-2012
 */

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class HeatIndex
{
    public static void main(String[ ] args) throws IOException
    {
        //define objects
        File file1 = new File("KeyWestHumid.txt");
        File file2 = new File("KeyWestTemp.txt");
        Scanner in = new Scanner(System.in);
        Scanner inFile1 = new Scanner(file1);
        Scanner inFile2 = new Scanner(file2);
        
        //define variables
        int k = 0;
        int humidTotal = 0;
        double hiTotal = 0.0;
        double tempTotal = 0.0;
        
        //arrays
        int [ ] humid = new int [13];
        double [ ] hi = new double [13];
        double [ ] temp = new double [13];
        String [ ] months = {"Jan.", "Feb.", "Mar.", "Apr.", "May ", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.", "Avg."};
                
        //read files
        while (inFile1.hasNext())
        {
            humid[k] = inFile1.nextInt();
            humidTotal = humidTotal + humid[k];
            k++;
        }
        inFile1.close();
        
        k = 0;
        while (inFile2.hasNext())
        {
            temp[k] = inFile2.nextDouble();
            tempTotal = tempTotal + temp[k];
            k++;
        }
        inFile2.close();
        
        //math
        humid[12] = (int) (humidTotal / 12.0);
        temp[12] = tempTotal / 12.0;
        for (int index = 0; index <= 11; index++)
        {
            if (temp[index] > 80 && humid[index] > 40)
            {
                hi[index] = (-42.379)
                        + (2.04901523 * temp[index])
                        + (10.14333127 * (double) humid[index])
                        - (0.22475541 * temp[index] * (double) humid[index])
                        - (.00683783 * temp[index] * temp[index])
                        - (.05481717 * (double) humid[index] * (double) humid[index])
                        + (.00122874 * temp[index] * temp[index] * (double) humid[index])
                        + (.00085282 * temp[index] * (double) humid[index] * (double) humid[index])
                        - (.00000199 * temp[index] * temp[index] * (double) humid[index] * (double) humid[index]);  
                hiTotal = hiTotal + hi[index];
            }
        }
        hi[12] = hiTotal / 12;
        
        //display
        System.out.printf("%20s%s%n", "", "Heat Index: Key West, Florida");
        System.out.printf("%39s%n", "Months");
        System.out.printf("%16s", "");
        for (String month : months)
            System.out.print(month + "  ");
        System.out.println();
        System.out.println("********************************************************************************************");
        System.out.printf("%s%6s", "Temp (F)", "");
        for (double temperature : temp)
            System.out.printf("%6.1f", temperature);
        System.out.println();
        System.out.printf("%s%2s", "Humidity (%)", "");
        for (int humidity : humid)
            System.out.printf("%6d", humidity);
        System.out.println();
        System.out.printf("%s%8s", "HI (F)", "");
        for (double heatIndex : hi)
            System.out.printf("%6.1f", heatIndex);
        System.out.println();
        System.out.println("********************************************************************************************");
    }//end of main method
}//end of class