/**
 * Uses the methods in CarV7 to calculate gas mileage data.
 * 
 * Zachary Gill
 * 01-17-2013
 */

public class CarV7Tester
{
    //main method
    public static void main(String [] args)
    {
        //variables
        int cars = 3;
        
        //arrays
        CarV7 car [] = new CarV7[cars];
        
        //objects
        car[0] = new CarV7("11 Honda Odyssey", 24351, 24784, 22.4, 3.37);
        car[1] = new CarV7("99 Dodge Ram", 152115, 152485, 28.5, 3.37);
        car[2] = new CarV7("06 Smart FourTwo", 84178, 84711, 16.8, 3.37);
        
        //table output
        System.out.printf("%60s%s%n", "", "Gas Milage Calculations");
        System.out.printf("%-26s%-16s%-16s%-16s%-16s%-16s%-16s%-16s%-16s%n", "Type of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "Cost", "Miles/Gal", "Gal/Mile");
        System.out.println("===================================================================================================================================================");
        
        //loops
        for (CarV7 inMem : car)
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
