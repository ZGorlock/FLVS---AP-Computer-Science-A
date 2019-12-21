import java.util.ArrayList;

/**
 * Uses objects from the CO2FromElectrictyV1 class to calculate pounds of CO2 emission from using Electricity.
 * 
 * @author Zachary Gill
 * @version 01-20-2013
 */
public class CO2FromElectricityTester
{
    /**
     * Main method for CO2FromElectricityTester.
     */
    public static void main(String [] args)
    {
        //objects
        CO2FromElectricity co2 = new CO2FromElectricity();
        
        //variables
        double avgBill = 0.0;
        double avgPrice = 0.0;
        double co2Emissions = 0.0;
        
        //arrays
        ArrayList<Double> monthlyBill = new ArrayList<Double>();
        monthlyBill.add(118.08);
        monthlyBill.add(108.77);
        monthlyBill.add(129.39);
        ArrayList<Double> monthlyPrice = new ArrayList<Double>();
        monthlyPrice.add(.13);
        monthlyPrice.add(.12);
        monthlyPrice.add(.12);
        
        
        //math
        avgBill = co2.calcAverageBill(monthlyBill);
        avgPrice = co2.calcAveragePrice(monthlyPrice);
        co2Emissions = co2.calcElectricityCO2(avgBill, avgPrice);
        
        //output
        System.out.printf("%s%.2f%n", "Average Monthly Electricity Bill: ", avgBill);
        System.out.printf("%s%.2f%n", "Average Monthly Electricity Price: ", avgPrice);
        System.out.printf("%s%.1f%s%n", "Annual CO2 Emissions from Electricity Usage: ", co2Emissions, " pounds");
    }
}