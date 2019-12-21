import java.util.ArrayList;

/**
 * Uses objects from the Catapult class to calculate several projectiles of a catapult.
 * 
 * @author Zachary Gill
 * @version 02-10-2013
 */
public class CatapultTester
{
    /**
     * Main method for CatapultTester.
     */
    public static void main(String [] args)
    {
        //default object array
        Catapult[][] catplt = new Catapult[6][7];
                
        //make objects
        for (int x = 0; x < 6; x ++)
            for (int y = 0; y < 7; y++)
                catplt[x][y] = new Catapult(((x * 5) + 25), ((y * 5) + 20));
        
        //math
        for (int x = 0; x < 6; x ++)
            for (int y = 0; y < 7; y++)
                catplt[x][y].calcProjectile();
        
        //output
        System.out.printf("%32s%s%n", "", "Projectile Distance (feet)");
        System.out.printf("%8s%12s%12s%12s%12s%12s%12s%n", "MPH", "25 deg", "30 deg", "35 deg", "40 deg", "45 deg", "50 deg");
        System.out.println("**************************************************************************************");
        for (int y = 0; y < 7; y ++)
            System.out.printf("%8d%12.2f%12.2f%12.2f%12.2f%12.2f%12.2f%n", ((y * 5) + 20), catplt[0][y].getDistance(), catplt[1][y].getDistance(), catplt[2][y].getDistance(), catplt[3][y].getDistance(), catplt[4][y].getDistance(), catplt[5][y].getDistance());
    }
}