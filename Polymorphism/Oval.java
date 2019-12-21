
/**
 * Oval class extends circle.
 * 
 * �FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Oval extends Circle
{
	// instance variables 
	private int radius2;

	/**
	 * Constructor for objects of class oval
	 */
	public Oval(int x, int y, int rad1, int rad2)
	{
		super(x, y, rad1);
	    // initialise instance variables
		radius2 = rad2;
	}


	public int getRadius2()
	{
		
		return radius2;
	}
}
