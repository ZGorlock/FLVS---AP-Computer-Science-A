/**
 * Determines target heart rate for user.
 * 
 * Zachary Gill
 * 11-11-2012
 */
import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String target = "within";
        Scanner in = new Scanner(System.in);
        
        //Prompt user for input
        System.out.println("Determine Your Target Heart Rate Zone for Cardiovascular Exercise (50% - 85%)");
        System.out.println();
        
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        System.out.print("Enter your resting heart rate: ");
        int restHR = in.nextInt();        
        System.out.print("Enter your heart rate after exercising: ");
        int activeHR = in.nextInt();
        System.out.println();
        
        //Calculate heart rate target zone min and max
        int maxHR = 220 - age;
        int hrr = maxHR - restHR;
        int minTarget = (int) (hrr * .5) + restHR;
        int maxTarget = (int) (hrr * .85) + restHR;
                
        //Determine if heart rate after exercise is between the min and max
        boolean isAbove = false;
        boolean isBelow = false;
        if (activeHR < minTarget) 
            isBelow = true;
        if (activeHR > maxTarget)
            isAbove = true;
        
        //If the heart rate is below, change the value of target to "below".
        if (isBelow)
            target = "below";
       
        //If the heart rate is above, change the value of target to "above".
        if (isAbove)
            target = "above";
        
        //Print two output statements
        //The first stating the heart rate target zone
        System.out.println("Your heart rate target zone is between " + minTarget + " and " + maxTarget);
        
        //The second stating if the heart rate after exercise  was within, above or below
        //the target zone. The variable "target" will have a value of within, above or below
        System.out.println("After just exercising, your heart rate is " + target + " your target zone");
    } //end main
}//end class TargetZone