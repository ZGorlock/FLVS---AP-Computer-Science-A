/**
 * Converts to and from English and metric units of measure.
 * 
 * Zachary Gill
 * 01-08-2013
 */

public class MeasurementConverterV2
{
    //prints purpose of program
    public static void printPurpose( )
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;      
    } 
    
    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;      
    } 
    
    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        return mi * 1.60934;
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        return km / 1.60934;
    } 
    
    //convert pounds to kilograms
    public static double convertPoundsToKilograms(double lb)
    {
        return lb * 2.20462;
    } 
    
    //convert kilograms to pounds
    public static double convertKilogramsToPounds(double kg)
    {
        return kg / 2.20462;
    }
    
    //convert gallons to liters
    public static double convertGallonsToLiters(double gal)
    {
        return gal * 3.78541;
    }
    
    //convert liters to gallons
    public static double convertLitersToGallons(double l)
    {
        return l / 3.78541;
    }
        
    //convert inches to centimeters
    public static double convertInchesToCentimeters(double in)
    {
        return in * 2.54;
    }
    
    //convert centimeters to inches
    public static double convertCentimetersToInches(double cm)
    {
        return cm / 2.54;
    }
    
    //main method
    public static void main(String[ ] args)
    {
        //declare variables
        double miles = 0.0;
        double feet = 0.0;
        double inches = 0.0;
        double pounds = 0.0;
        double gallons = 0.0;
        double centimeters = 0.0;
        double kilometers = 0.0;
        double kilograms = 0.0;
        double liters = 0.0;
    
        printPurpose();                                    //invoke the printPurpose() method
        feet = 6230;
        miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft.  =  %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi.  =  %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi.  =  %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        miles = convertKilometersToMiles(kilometers);
        System.out.printf("%8.1f km.  =  %7.1f mi. %n", kilometers, miles);
        
        pounds = 204;
        kilograms = convertPoundsToKilograms(pounds);
        System.out.printf("%8.1f lbs. =  %7.1f kg. %n", pounds, kilograms);
       
        kilograms = 58951.54;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%8.1f kg.  =  %7.1f lbs. %n", kilograms, pounds);
        
        gallons = 950;
        liters = convertGallonsToLiters(gallons);
        System.out.printf("%8.1f gal. =  %7.1f l. %n", gallons, liters);
        
        liters = 950;
        gallons = convertLitersToGallons(liters);
        System.out.printf("%8.1f l.   =  %7.1f gal. %n", liters, gallons);
        
        
        centimeters = 7.64;
        inches = convertCentimetersToInches(centimeters);
        System.out.printf("%8.1f cm.  =  %7.1f in. %n", centimeters, inches);
        
        inches = 1200.7;
        centimeters = convertInchesToCentimeters(inches);
        System.out.printf("%8.1f in.  =  %7.1f cm. %n", inches, centimeters);
           
    }//end of main method
}//end of class