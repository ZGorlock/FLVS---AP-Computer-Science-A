/**
 * Winter Mountain terrain.
 * 
 * @author Zachary Gill
 * @version 03-03-2013
 */
public class WinterMountain extends Mountain
{
    // instance variables - replace the example below with your own
    private double temp;

    /**
     * Constructor for objects of class WinterMountain
     */
    public WinterMountain(int l, int w, int m, double t)
    {
        // initialise instance variables
        super (l, w, m);
        temp = t;
    }

    /**
     * Getter method for temperature.
     * 
     * @return number temperature
     */
    public double getTemp()
    {
        return temp;
    }
}
