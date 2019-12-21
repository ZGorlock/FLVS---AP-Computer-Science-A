/**
 * Calculates metric tons of CO2 emmitted in a year of driving vehicle used in Annual Fuel Use project.
 * 
 * @author Zachary Gill
 * @version 01-17-2013
 */

public class CO2FootprintV1
{
    // instance variables
    double myGallonsUsed = 0.0;
    double myTonsCO2 = 0.0;
    double myPoundsCO2 = 0.0;
    
    /**
     * Default constructor for objects of type CO2FootprintV1
     */
    public CO2FootprintV1()
    {
    }
    
    /**
     * Constructor for objects of type CO2FootprintV1
     * 
     * @param gals number of gallons used
     */
    public CO2FootprintV1(double gals)
    {
        // initialise instance variables
        myGallonsUsed = gals;
    }
    
    /**
     * Convert pounds of CO2 emitted from tons of CO2 emitted
     * 
     * @return the pounds of CO2 emitted
     */
    public double convertTonsCO2toPoundsCO2()
    {
        return myTonsCO2 / 0.00045359237;
    }
    
    /**
     * Calculates tons of CO2 emitted from gallons of fuel used
     * 
     * @return the tons of CO2 emitted
     */
    public double calcTonsCO2()
    {
        return myGallonsUsed * (8.78 * Math.pow(10, -3));
    }
}