/**
 * Uses objects from the CO2FootprintV1 class to calculate metric tons of CO2 emmitted in a year of driving vehicle used in Annual Fuel Use project.
 * 
 * @author Zachary Gill
 * @version 01-17-2013
 */
public class CO2FootprintV1Tester
{
    /**
     * Main method for CO2FootprintV1Tester class.
     */
    public static void main(String [] args)
    {
        //variables
        double gallons = 1507.45;
        
        //objects
        CO2FootprintV1 footprint = new CO2FootprintV1(gallons);
        
        //math
        footprint.myTonsCO2 = footprint.calcTonsCO2();
        footprint.myPoundsCO2 = footprint.convertTonsCO2toPoundsCO2();
        
        //output
        System.out.printf("%14s%s%n", "", "CO2 Emissions");
        System.out.printf("%12s%12s%12s%n", "Gallons", "Pounds", "Tons");
        System.out.printf("%12s%13s%13s%n", "of Gas", "from Gas", "from Gas");
        System.out.println("*******************************************");
        System.out.printf("%12.2f%12.2f%12.2f%n", footprint.myGallonsUsed, footprint.myPoundsCO2, footprint.myTonsCO2);
    }
}
