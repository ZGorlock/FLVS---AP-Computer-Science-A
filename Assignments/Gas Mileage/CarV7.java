/**
 * Calculates Gas Mileage data for a car.
 * 
 * Zachary Gill
 * 01-17-2013
 */

public class CarV7
{
    // instance variables
    int myDistance = 0;
    int myEndMiles = 0;
    int myStartMiles = 0;
    double myCost = 0.0;
    double myGallons = 0.0;
    double myGPM = 0.0;
    double myMPG = 0.0;
    double myPrice = 0.0;
    String myCar = "";
    
    //default constructor
    public CarV7()
    {
    }
    
    //constructor for objects in class CarV7
    public CarV7(String car, int startMiles, int endMiles, double gallons, double price)
    {
        // initialise instance variables
        myCar = car;
        myStartMiles = startMiles;
        myEndMiles = endMiles;
        myGallons = gallons;
        myPrice = price;
    }
    
    //prints gas mileage data output
    public void printOutput()
    {
        System.out.printf("%-16s%16d%16d%16d%16.2f%16.2f%16.2f%16.2f%16.2f%n", myCar, myStartMiles, myEndMiles, myDistance, myGallons, myPrice, myCost, myMPG, myGPM);
    }
    
    //calculates distance between end miles and start miles
    public int calcDistance()
    {
        return myEndMiles - myStartMiles;
    }
    
    //calculates gpm from distance and gallons
    public double calcGPM()
    {
        return myGallons / myDistance;
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
