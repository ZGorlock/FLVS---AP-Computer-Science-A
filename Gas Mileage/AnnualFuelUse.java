/**
 * Calculates Annual Fuel Usage data for a car.
 * 
 * Zachary Gill
 * 01-17-2013
 */

public class AnnualFuelUse
{
    // instance variables
    int myDays = 0;
    int myDistance = 0;
    int myEndMiles = 0;
    int myStartMiles = 0;
    double myCost = 0.0;
    double myGallons = 0.0;
    double myMPG = 0.0;
    double myPrice = 0.0;
    
    //default constructor
    public AnnualFuelUse()
    {
    }
    
    //constructor for objects in class AnnualFuelUse
    public AnnualFuelUse(int days, int startMiles, int endMiles, double gallons, double price)
    {
        // initialise instance variables
        myDays = days;
        myStartMiles = startMiles;
        myEndMiles = endMiles;
        myGallons = gallons;
        myPrice = price;
    }
    
    //prints gas mileage data output
    public void printOutput(int x)
    {
            System.out.printf("%d%16d%16d%16d%16d%16.2f%16.2f%16.2f%16.2f%n", (x + 1), myDays, myStartMiles, myEndMiles, myDistance, myGallons, myMPG, myPrice, myCost);
    }
    
    //calculates distance between end miles and start miles
    public int calcDistance()
    {
        return myEndMiles - myStartMiles;
    }
        
    //calculates mpg from distance and gallons
    public double calcMPG()
    {
        return myDistance / myGallons;
    }
    
    //calculates cost of a fill-up
    public double totalCost()
    {
        return myGallons * myPrice;
    }
}
