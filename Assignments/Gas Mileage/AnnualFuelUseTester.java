/**
 * Uses the methods in AnnualFuelUse to calculate gas mileage data.
 * 
 * Zachary Gill
 * 01-17-2013
 */

public class AnnualFuelUseTester
{
    //main method
    public static void main(String [] args)
    {
        //variables
        int annualDistance1 = 0;
        int totalDistance1 = 0;
        int fills = 3;
        int maxDistance1 = Integer.MIN_VALUE;
        int minDistance1 = Integer.MAX_VALUE;
        double annualCost1 = 0.0;
        double annualGallons1 = 0.0;
        double annualMPG1 = 0.0;
        double daysInYear = 365.242374;
        double maxMPG1 = Double.MIN_VALUE;
        double maxPrice1 = Double.MIN_VALUE;
        double minMPG1 = Double.MAX_VALUE;
        double minPrice1 = Double.MAX_VALUE;
        double totalCost1 = 0.0;
        double totalGallons1 = 0.0;
        double totalMPG1 = 0.0;
        double totalPrice1 = 0.0;
        
        //arrays
        AnnualFuelUse fill [] = new AnnualFuelUse[fills];
        int days1 [] = {1, 9, 11};
        int endMiles1 [] = {24784, 24841, 25211};
        int startMiles1 [] = {24351, 24784, 24841};
        double gallons1 [] = {22.4, 3.3, 19.7};
        double price1 [] = {3.37, 3.41, 3.41};
        
        //objects
        for (int x = 0; x <= (fills - 1); x++)
            fill[x] = new AnnualFuelUse(days1[x], startMiles1[x], endMiles1[x], gallons1[x], price1[x]);
        
        //table output
        System.out.printf("%53s%s%n", "", "Annual Fuel Usage Calculations");
        System.out.printf("%-14s%-14s%-14s%-14s%-14s%-24s%-14s%-14s%-14s%n", "Fill Up", "Days", "Start Miles", "End Miles", "Distance", "Gallons Used", "MPG", "Price", "Cost");
        System.out.println("========================================================================================================================================");
        
        //loops
        for (int x = 0; x <= (fills - 1); x++)
        {
            //math
            fill[x].myDistance = fill[x].calcDistance();
            fill[x].myMPG = fill[x].calcMPG();
            fill[x].myCost = fill[x].totalCost();
            
            //totals
            totalDistance1 = totalDistance1 + fill[x].myDistance;
            totalCost1 = totalCost1 + fill[x].myCost;
            totalGallons1 = totalGallons1 + gallons1[x];
            totalMPG1 = totalMPG1 + fill[x].myMPG;
            
            //min/max
            if (fill[x].myDistance < minDistance1)
                minDistance1 = fill[x].myDistance;
            if (fill[x].myDistance > maxDistance1)
                maxDistance1 = fill[x].myDistance;
            if (fill[x].myMPG < minMPG1)
                minMPG1 = fill[x].myMPG;
            if (fill[x].myMPG > maxMPG1)
                maxMPG1 = fill[x].myMPG;
            if (price1[x] < minPrice1)
                minPrice1 = price1[x];
            if (price1[x] > maxPrice1)
                maxPrice1 = price1[x];
        }
        
        //annual math
        annualDistance1 = (int) (totalDistance1 * (daysInYear / days1[(fills - 1)]));
        annualGallons1 = totalGallons1 * (daysInYear / days1[(fills - 1)]);
        annualMPG1 = (totalMPG1 / fills);
        annualCost1 = totalCost1 * (daysInYear / days1[(fills - 1)]);
        
        //data output
        for (int x = 0; x <= 2; x++)
            fill[x].printOutput(x);
        System.out.println();
        System.out.printf("%-49s%16d%32.2f%16.2f%n", "Minimum:", minDistance1, minMPG1, minPrice1);
        System.out.printf("%-49s%16d%32.2f%16.2f%n", "Maximum:", maxDistance1, maxMPG1, maxPrice1);
        System.out.println();
        System.out.printf("%-49s%16d%16.2f%48.2f%n", "Totals:", totalDistance1, totalGallons1, totalCost1);
        System.out.printf("%-49s%16d%16.2f%16.2f%32.2f%n", "Annual Projection:", annualDistance1, annualGallons1, annualMPG1, annualCost1);
    }
}
