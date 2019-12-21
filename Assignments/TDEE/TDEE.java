/**
 * Determines the TDEE of the user.
 * 
 * Zachary Gill 
 * 11-15-2012
 */
import java.util.Scanner;
public class TDEE
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        double actLv = 0.0;
                
        System.out.print("Please enter your name: ");
        String name = in.nextLine();
        System.out.print("Please enter your BMR: ");
        double bmr = in.nextDouble();
        System.out.print("Please enter your Gender (M/F): ");
        String gender = in.next();
        
        if ((gender.equalsIgnoreCase("M")) || gender.equalsIgnoreCase("F"))
        {
            System.out.println();
            System.out.println("Select You Activity Level");
            System.out.println("[0] Resting (Sleeping, Reclining)");
            System.out.println("[1] Sedentary (Minimal Movement)");
            System.out.println("[2] Light (Sitting, Satnding)");
            System.out.println("[3] Moderate (Light Manual Labour, Dancing, Riding Bike)");
            System.out.println("[4] Very Active (Team Sports, Hard Manual Labour)");
            System.out.println("[5] Extremely Active (Full-time Athlete, Heavy Manual Labour)");
            System.out.println();
            System.out.print("Enter the letter corresponding to your activity level: ");
            int activity = in.nextInt();
            
            boolean isM = gender.equalsIgnoreCase("M");
            boolean isF = gender.equalsIgnoreCase("F");
            
            if (activity == 0)
                actLv = 0;   
            else if (activity == 1)
                actLv = 1.3;
            else if (activity == 2 && isM)
                actLv = 1.6;
            else if (activity == 2 && isF)
                actLv = 1.5;
            else if (activity == 3 && isM)
                actLv = 1.7;
            else if (activity == 3 && isF)
                actLv = 1.6;
            else if (activity == 4 && isM)
                actLv = 2.1;
            else if (activity == 4 && isF)
                actLv = 1.9;
            else if (activity == 5 && isM)
                actLv = 2.4;
            else if (activity == 5 && isF)
                actLv = 2.2;
            else
                System.out.println("You did not select a valid Activity Level!");
            
            double tdeeCalc = actLv * bmr;
                
            System.out.println("Name: " + name + "     Gender: " + gender);
            System.out.println("BMR: " + bmr + " calories    Activity Level: " + actLv);
            System.out.println("TDEE: " + tdeeCalc + " calories");            
        }
        else
            System.out.println("You did not enter a valid gender!");
    }
}
