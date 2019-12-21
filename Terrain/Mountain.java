/**
 * Mountain terrain.
 * 
 * @author Zachary Gill
 * @version 03-03-2013
 */
public class Mountain extends Terrain
{
    // instance variables - replace the example below with your own
    private int mountains;

    /**
     * Constructor for objects of class Mountain
     */
    public Mountain(int l, int w, int m)
    {
        // initialise instance variables
        super (l, w);
        mountains = m;
    }

    /**
     * Getter method for number of mountains.
     * 
     * @return number of mountains
     */
    public int getMountain()
    {
        return mountains;
    }
}
