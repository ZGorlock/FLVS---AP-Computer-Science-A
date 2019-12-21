/**
/**
 * Makes Cube3 objects.
 * 
 * @author Zachary Gill
 * @version 03-06-2013
 */
public class Cube3 extends Box3
{
    /**
     * Constructor for objects of class cube3
     */
    public Cube3(int side)
    {
        // call superclass
        super(side, side, side);
    }
    
	public String toString()
	{
	    return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}
