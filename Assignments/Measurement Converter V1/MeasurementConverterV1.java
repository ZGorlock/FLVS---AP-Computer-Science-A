/**
 * MeasuermentConverter_v1 converts different units of measure.
 *
 * �FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 *
 * Modified by: Zachary Gill
 * Date: 10-18-2012
 */
public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double km;
        double lb;
        double kg;
        double gallon;
        double liter;
        double quart;

        double feetPerMile = 5280;      //number of feet per 1 mile
        double kmPerMile = 1.60934;
        double lbPerKg = 2.20462;
        double literPerGallon = 0.264172;
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 12.4;
        feet = feetPerMile * miles;
        System.out.println(miles + " mi. = " + feet + " ft.");
        
        
        //convert miles to kilometers
        miles = 1521.06;
        km = miles * kmPerMile;
        System.out.println(miles + " mi. = " + km + " km.");
        
        
        //conver kilometers to miles
        km = 84.123;
        miles = km / kmPerMile;
        System.out.println(km + " km. = " + miles + " mi.");
        
        
        //convert pounds to kilograms
        lb = 5.4;
        kg = lb / lbPerKg;
        System.out.println(kg + " kg. = " + lb + " lb.");
        

        //convert kilograms to pounds
        kg = 5.4;
        lb = kg * lbPerKg;
        System.out.println(lb + " lb. = " + kg + " kg.");

        
        //convert gallons to liters
        gallon = 455.01;
        liter = gallon * literPerGallon;
        System.out.println(gallon + " gallon. = " + liter + " liter.");
        

        //convert liters to gallons
        liter = 455.01;
        gallon = liter / literPerGallon;
        System.out.println(liter + " liter. = " + gallon + " gallon.");
        
        
        //convert quarts to gallons
        quart = 875.60145;
        gallon = quart / 4;
        System.out.println(quart + " quart. = " + gallon + " gallon.");
        

        //convert gallons to quarts
        gallon  = 875.60145;
        quart = gallon * 4;
        System.out.println(gallon + " gallon. = " + quart + " quart.");
        
        
    }//end of main method
}//end of class

