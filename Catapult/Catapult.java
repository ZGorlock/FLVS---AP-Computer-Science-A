import java.util.ArrayList;

/**
 * Calculates several trajectories of a catapult.
 * 
 * @author Zachary Gill
 * @version 02-10-2013
 */

public class Catapult
{
    //private instance variables
    private double myAngle = 0.0;
    private double myDistance = 0.0;
    private double mySpeed = 0.0;
    
    /**
     * Default constructor for objects of type Catapult.
     */
    public Catapult()
    {
    }
    
    /**
     * A constructor method that initiates instance variables for the Catapult object.
     * 
     * @param angle angle at which the projectile is being launched.
     * @param speed speed at which the projectile is being launched.
     */
    public Catapult(int angle, int speed)
    {
        myAngle = Math.toRadians(angle);
        mySpeed = mphToMs(speed);
    }
        
    /**
     * Mutator method to calculate the distance in feet travelled.
     */
    public void calcProjectile()
    {
        myDistance = ((Math.pow(mySpeed, 2) * Math.sin((2 * myAngle))) / 9.8) * 3.2808;
    }
    
    /**
     * Mutator method for converting miles per hour to meters per second.
     * 
     * @param mph the speed in miles per hour.
     * 
     * @return speed in meters per second.
     */
    public double mphToMs(int mph)
    {
        double ms = 0.0;
        ms = mph * .44704;
        return ms;
    }
    
    /**
     * Getter method that returns the myDistance private variable.
     * 
     * @return the distance the projectile object travelled in feet.
     */
    public double getDistance()
    {
        return myDistance;
    }
}