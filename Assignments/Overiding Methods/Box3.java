/**
 * Makes Box3 objects.
 * 
 * @author Zachary Gill
 * @version 03-06-2013
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}	
    public String equals(Box3 r)
    {
        String response = toString();
        if (r.getLength() == getLength() && r.getWidth() == getWidth() && r.getHeight() == getHeight())
            response = response + " is the same size as ";
        else
            response = response + " is not the same size as ";
        response = response + r;
        return response;
    }
	public String toString()
	{
	    return "Box - " + getLength() + " X " + getWidth() + " X " + getHeight();
	}
}
