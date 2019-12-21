/**
 * Creates IsoscelesTriangle objects
 * 
 * @author Zachary Gill
 * @version 02-25-2013
 */
public class IsoscelesTriangle extends Triangle
{
	/**
	 * Constructor for objects of class IsoscelesTriangle
	 */
	public IsoscelesTriangle(double a, double b)
	{
		// call superclass
		super(a, b, Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2))));
	}
}