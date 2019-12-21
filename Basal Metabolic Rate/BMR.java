/**
 * Calculates BMR for user.
 * 
 * Zachary Gill
 * 11-14-2012
 */
import java.util.Scanner;
public class BMR
{
    public static void main(String [] args)
    {
        //define variables
        double calories = 0.0;        
        
        //scanner object
        Scanner in = new Scanner(System.in);
        
        //user input
        System.out.print("Enter your name: ");
        String name = in.nextLine();        
        System.out.print("Gender (M or F): ");
        char gender = in.findInLine(".").charAt(0);      
        System.out.print("Enter your age: ");
        int age = in.nextInt();        
        System.out.print("Height in inches: ");
        int height = in.nextInt();        
        System.out.print("Weight in pounds: ");
        int weight = in.nextInt();
        System.out.println();
        System.out.println();
        
        //convert measurements
        double weightKG = (double) weight * .45359;
        double heightCM = (double) height / .3937;
        
        //calculate bmr
        if (gender == 'M')
            calories = ((13.397 * weightKG) + (4.799 * heightCM) - (5.677 * age) + 88.362);
        else if (gender == 'F')
            calories = ((9.247 * weightKG) + (3.098 * heightCM) - (4.330 * age) + 447.593);
        
        //print output
        System.out.println("Calculate Your Basal Metabolism");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Weight (kg): " + weightKG);
        System.out.println("Height (cm): " + heightCM);
        System.out.println("Basal Metabolic Rate: " + calories + " calories per day");
        
    }                                                     
}
