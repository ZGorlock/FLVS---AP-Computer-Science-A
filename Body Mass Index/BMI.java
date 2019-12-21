/**
 * Calculates BMI for user.
 * 
 * Zachary Gill
 * 11-14-2012
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String [] args)
    {
        //define variables
        String bmiCategory = "";
        
        //scanner object
        Scanner in = new Scanner(System.in);
        
        //user input
        System.out.print("Enter your name (first last): ");
        String firstname = in.next();
        String lastname = in.nextLine();
        System.out.print("Height in feet and inches (e.g. 5 11): ");
        int feet = in.nextInt();
        int inches = in.nextInt();        
        System.out.print("Weight in pounds: ");
        int weight = in.nextInt();
        System.out.println();
        
        //convert measurements
        double weightKG = (double) weight * .45359;
        int height = (feet * 12) + inches;
        double heightM = (double) height / 39.3701;
        
        //calculate bmi
        double bmiCalc = weightKG / (heightM * heightM);
        
        //determine category
        if (bmiCalc >= 30)
            bmiCategory = "Obese";
        else if (bmiCalc >= 25)
            bmiCategory = "Overweight";
        else if (bmiCalc >= 18.5)
            bmiCategory = "Normal";
        else
            bmiCategory = "Underweight";
        
        //print output
        System.out.println("Body Mass Index Calculator");
        System.out.println("==========================");
        System.out.println();
        System.out.println("Name: " + firstname + " " + lastname);
        System.out.println("Height (m): " + heightM);
        System.out.println("Weight (kg): " + weightKG);
        System.out.println("Category: " + bmiCategory);
        
    }                                                     
}
