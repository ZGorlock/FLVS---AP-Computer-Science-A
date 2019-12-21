
/**
 * Displays the average temperature and precipitation of a city in Florida.
 * 
 * Zachary Gill
 * 01-01-2012
 */

import java.util.Scanner;

public class AnnualClimate2
{
    public static void main(String[ ] args)
    {
        //define objects
        Scanner in = new Scanner(System.in);
        
        //define variables
        double ttotal = 0.0;
        double ptotal = 0.0;
        double tavg = 0.0;
        String ttype = "F";
        String ptype = "in.";
        String city = "Tallahassee";
        String average = "";
        String annual = "";
        
        //define arrays
        String [ ] month = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double [ ] temp = {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};
        double [ ] prec = {5.4,  4.6, 6.5, 3.6, 5.0, 6.9, 8.0, 7.0, 5.0, 3.3, 3.9, 4.1};
        
        //standard or metric temperature
        System.out.print("Would you like the tempertaure in Celcius of Fahrenheit? (C/F):");
        ttype = in.next();
        if (ttype.equalsIgnoreCase("C"))
        {
            for (int k = 0; k <= 11; k++)
            {
                temp[k] = (temp[k] - 32) * (5.0/9.0);
            }
            ptype = "C";
        }
        else if (ttype.equalsIgnoreCase("F"))
            ttype = "F";
        else
        {
            System.out.println("Invalid entry! Default = Fahrenheit");
            ttype = "F";
        }
        
        //standard or metric precipitation
        System.out.print("Would you like the precipitation in Inches of Centimeters? (I/C):");
        ptype = in.next();
        if (ptype.equalsIgnoreCase("C"))
        {
            for (int k = 0; k <= 11; k++)
            {
                prec[k] = prec[k] * 2.54;
            }
            ptype = "cm.";
        }
        else if (ptype.equalsIgnoreCase("I"))
            ptype = "in.";
        else
        {
            System.out.println("Invalid entry! Default = Inches");
            ptype = "in.";
        }
        
        //math
        for (int k = 0; k <= 11; k++)
        {
            ttotal = ttotal + temp[k];
            ptotal = ptotal + prec[k];
        }
        tavg = ttotal / 12;
        
        //display
        System.out.printf("%34s%n", "Climate Data");
        System.out.println("Location: " + city + ", Florida");
        System.out.printf("%-21s%-13s%s%s%24s%s%s%n", "Month", "Temperature (", ttype, ")", "Precipitation (", ptype, ")");
        System.out.println("********************************************************************************");
        for (int k = 0; k <= 11; k++)
            System.out.printf("%-25s%.1f%25.1f%n", month[k], temp[k], prec[k]);
        System.out.println("********************************************************************************");
        System.out.printf("%30s%4.1f%20s%4.1f%n", "Average:", tavg, "Annual:", ptotal);
    }//end of main method
}//end of class 
