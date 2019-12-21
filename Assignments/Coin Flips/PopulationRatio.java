/**
 * Simulates a population gender sample.
 * 
 * Zachary Gill
 * 11-23-2012
 */

import java.util.Scanner;
public class PopulationRatio
{
    public static void main(String[] args)
    {       
        Scanner in = new Scanner(System.in); 
        
        int male = 0;
        int female = 0;
        int counter = 1;
        double randNum = 0.0;    
        
        System.out.println("What is the size of population sample: ");
        int flips = in.nextInt();
        
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
               
            if(randNum < .491)
            {
                male++;
                System.out.println("\t male");
            }
            else
            {
                female++;
                System.out.println("\t female");
            }
            counter++;      
        }
        System.out.println();
        System.out.println("Population (M) = " + male + "  -  " + (((int)(((double) male / counter) * 1000)) / 10.0) + "%");
        System.out.println("Population (F) = " + female + "  -  " + (((int)(((double) female / counter) * 1000)) / 10.0) + "%");
    }
}
