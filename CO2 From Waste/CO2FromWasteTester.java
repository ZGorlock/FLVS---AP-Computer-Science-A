import java.util.ArrayList;

/**
 * Uses objects from the CO2FromWaste class to calculate CO2 emissions for a family.
 * 
 * @author Zachary Gill
 * @version 01-24-2013
 */
public class CO2FromWasteTester
{
    /**
     * Main method for CO2FromWasteTester.
     */
    public static void main(String [] args)
    {
        //variables
        int numFamily = 6;
        
        //arrays
        ArrayList<CO2FromWaste> co2 = new ArrayList<CO2FromWaste>();
        co2.add(new CO2FromWaste(5, true, true, false, true));
        co2.add(new CO2FromWaste(2, false, true, false, false));
        co2.add(new CO2FromWaste(3, true, false, false, true));
        co2.add(new CO2FromWaste(4, false, false, false, true));
        co2.add(new CO2FromWaste(4, true, true, false, false));
        co2.add(new CO2FromWaste(2, true, true, true, true));
        
        //math
        for (int x = 0; x < numFamily; x ++)
        {
            co2.get(x).calcGrossWasteEmission();
            co2.get(x).calcWasteReduction();
            co2.get(x).calcNetEmission();
        }
        
        //output
        System.out.printf("%110s%s%n%47s%s%31s%31s%n%-16s%-16s%-16s%-16s%-16s%-16s%-16s%-16s%-16s%n", "", "Pounds of CO2", "", "Household Waste Recycled", "Total", "Net", "Index", "People", "Paper", "Plastic", "Glass", "Cans", "Emission", "Reduction", "Emission");
        System.out.println();
        for (int x = 0; x < numFamily; x ++)
        {
            System.out.printf("%d%18d%18s%16s%16s%16s%18.2f%16.2f%16.2f%n", x, co2.get(x).getPeople(), co2.get(x).getPaper(), co2.get(x).getPlastic(), co2.get(x).getGlass(), co2.get(x).getCans(), co2.get(x).getGross(), co2.get(x).getReduction(), co2.get(x).getNet());
        }
    }
}