import java.util.ArrayList;

/**
 * Uses objects from the CO2Footprint class to calculate total pounds of CO2 emission.
 * 
 * @author Zachary Gill
 * @version 01-24-2013
 */
public class CO2FootprintTester
{
    /**
     * Main method for CO2FootprintTester.
     */
    public static void main(String [] args)
    {
        //default objects
        ArrayList<CO2Footprint> co2 = new ArrayList<CO2Footprint>();
        
        //variables
        int numFamily = 2;
        
        //arrays
        double [] gallons = {1507.45, 1042.87};        
        ArrayList<ArrayList<Double>> monthlyBill = new ArrayList<ArrayList<Double>>();
        monthlyBill.add(new ArrayList<Double>());
        monthlyBill.add(new ArrayList<Double>());
        monthlyBill.get(0).add(118.08);
        monthlyBill.get(0).add(108.77);
        monthlyBill.get(0).add(129.39);
        monthlyBill.get(1).add(215.75);
        monthlyBill.get(1).add(246.15);
        monthlyBill.get(1).add(209.44);
        ArrayList<ArrayList<Double>> monthlyPrice = new ArrayList<ArrayList<Double>>();
        monthlyPrice.add(new ArrayList<Double>());
        monthlyPrice.add(new ArrayList<Double>());
        monthlyPrice.get(0).add(.13);
        monthlyPrice.get(0).add(.12);
        monthlyPrice.get(0).add(.12);
        monthlyPrice.get(1).add(.13);
        monthlyPrice.get(1).add(.13);
        monthlyPrice.get(1).add(.13);        
        int [] people = {5, 2};
        boolean [][] wastes = {{true, true, false, true}, {false, false, false, true}};
        int [] bulbs = {10, 2};
        
        //make objects
        for (int x = 0; x < numFamily; x ++)
            co2.add(new CO2Footprint(gallons[x], monthlyBill.get(x), monthlyPrice.get(x), people[x], wastes[x], bulbs[x]));
        
        //math
        for (int x = 0; x < numFamily; x ++)
        {
            //Gas
            co2.get(x).calcGasCO2();           
            
            //Electricity
            co2.get(x).calcAverageBill();
            co2.get(x).calcAveragePrice();
            co2.get(x).calcElectricityCO2();
            
            //Waste
            co2.get(x).calcWasteCO2();
            co2.get(x).calcWasteReduction();
            
            //Bulb
            co2.get(x).calcBulbReduction();
            
            //Totals
            co2.get(x).calcGross();
            co2.get(x).calcReduction();
            co2.get(x).calcNet();
        }
        
        //output
        System.out.println("|                 Pounds of CO2                    |          Pounds of CO2          |                |");
        System.out.println("|                 Emitted From                     |           Reduced From          |                |");
        System.out.println("|      Gas       |   Electricity  |      Waste     |   Recycling    |    New Bulbs   |  CO2 Footprint |");
        System.out.println("|================|================|================|================|================|================|");
        for (int x = 0; x < numFamily; x ++)
            System.out.printf("%s%12.2f%5s%12.2f%5s%12.2f%5s%12.2f%5s%12.2f%5s%12.2f%5s%n", "|", co2.get(x).getGasCO2(), "|", co2.get(x).getElectricityCO2(), "|", co2.get(x).getWasteCO2(), "|", co2.get(x).getWasteReduction(), "|", co2.get(x).getBulbReduction(), "|", co2.get(x).getNet(), "|");
    }
}