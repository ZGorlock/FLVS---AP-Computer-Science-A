/**
 * Calculates MPG for a car.
 * 
 * Zachary Gill
 * 01-17-2013
 */

import java.util.Scanner;

public class CarV3
{
    // instance variables - replace the example below with your own
    String myCar = "";
    int myStartMiles = 0;
    int myEndMiles = 0;
    double myGallons = 0.0;
    
    /**
     * Constructor for objects of class CarV3
     */
    public CarV3(String car, int startMiles, int endMiles, double gallons)
    {
        // initialise instance variables
        myCar = car;
        myStartMiles = startMiles;
        myEndMiles = endMiles;
        myGallons = gallons;
    }
    
    //calculates distance between end miles and start miles
    public int calcDistance(int sMiles, int eMiles)
    {
        return eMiles - sMiles;
    }
    
    //calculates mpg from distance and gallons
    public double calcMPG(int dist, double gals)
    {
        return dist / gals;
    }

    //main method
    public static void main(String [] args)
    {
        //objects
        CarV3 car1 = new CarV3("11 Honda Civic", 24351, 24784, 22.4);
        Scanner in1 = new Scanner(System.in);
        
        //math
        int distance1 = car1.calcDistance(car1.myStartMiles, car1.myEndMiles);
        double mpg1 = car1.calcMPG(distance1, car1.myGallons);
        
        //output
        System.out.printf("%30s%s%n", "", "Gas Milage Calculations");
        System.out.printf("%-20s%-16s%-16s%-16s%-16s%-16s%n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Miles/Gal");
        System.out.println("==============================================================================================");
        System.out.printf("%-20s%d%16d%16d%16.2f%16.2f", car1.myCar, car1.myStartMiles, car1.myEndMiles, distance1, car1.myGallons, mpg1);
    }
}
