/**
 * Calculates Gas Mileage data for a car.
 * 
 * Zachary Gill
 * 01-17-2013
 */

public class CarV5
{
    // instance variables
    private int myDistance = 0;
    private int myEndMiles = 0;
    private int myStartMiles = 0;
    private double myCost = 0.0;
    private double myGallons = 0.0;
    private double myGPM = 0.0;
    private double myMPG = 0.0;
    private double myPrice = 0.0;
    private String myCar = "";
    
    //default constructor
    public CarV5()
    {
    }
    
    //constructor for objects in class CarV5
    public CarV5(String car, int startMiles, int endMiles, double gallons, double price)
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

    //main method
    public static void main(String [] args)
    {
        //variables
        int cars = 1;
        
        //arrays
        CarV5 car [] = new CarV5[cars];
        
        //objects
        car[0] = new CarV5("11 Honda Civic", 24351, 24784, 22.4, 3.37);
        
        //table output
        System.out.printf("%60s%s%n", "", "Gas Milage Calculations");
        System.out.printf("%-26s%-16s%-16s%-16s%-16s%-16s%-16s%-16s%-16s%n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("===================================================================================================================================================");
        
        //loops
        //for (int x = 0; x <= (cars - 1); x ++)
        for (CarV5 inMem : car)
        {
            //math
            inMem.myDistance = inMem.calcDistance();
            inMem.myMPG = inMem.calcMPG();
            inMem.myGPM = inMem.calcGPM();
            inMem.myCost = inMem.totalCost();
        
            //data output
            inMem.printOutput();
        }
    }
}
