
/**
 * Write a description of class MeasurementConverterV2_Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MeasurementConverterV2
{
//Purpose of program
    public static void printPurpose( )  //notice that this method is void, nothing is returned
    {
        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");
    }
        
    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method. 
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
        //return statement calculate kilometers goes here      
    } 
    
    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        //return statement to calculate miles goes here     
    } 
    
    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    {
        //return statement to calculate kilograms goes here    
    } 
    
    //convert kilograms to pounds
    // method header to convert kilograms to pounds goes here
    {
        //return statement to calculate pounds goes here     
    } 
    
    
    
        
    public static void main(String[ ] args)
    {
        //local variables
        //double miles, feet, inches, pounds, gallons;
        //double kilometers, kilograms, liters;
        
        //variable declaration and initialization
    
        printPurpose();                                    //invoke the printPurpose() method
        double feet = 6230;
        double miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);
        
        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);
        
        miles = 22.3;
        double kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);
        
        kilometers = 1000.0;
        //call method to convert kilometers to miles goes here
        //print results goes here
        
        double pounds = 204;
         //call method to convert pounds to kilograms goes here
        //print results goes here
       
        //declare and initialize the kilograms variable goes here
        //call method to convert kilograms to pounds goes here
        //print results goes here
        
        //declare and initialize the gallons variable goes here
        //call method to convert gallons to liters goes here
        //print results goes here
        
        //declare and initialize the liters variable goes here
        //call method to convert liters to gallons goes here
        //print results goes here
           
    }//end of main method
	
}//end of class


