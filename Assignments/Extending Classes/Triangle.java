/**
 * Creates Triangle objects
 * 
 * @author Zachary Gill
 * @version 02-25-2013
 */
public class Triangle
{
	// instance variables 
	private double sideA;
	private double sideB;
	private double sideC;

	/**
	 * Constructor for objects of class triangle
	 */
	public Triangle(double sa, double sb, double sc)
	{
		// initialise instance variables
		sideA = sa;
		sideB = sb;
		sideC = sc;
	}

	// return side a
	public double getSideA()
	{
		return sideA;
	}
	
	// return side b
	public double getSideB()
	{
	    return sideB;
	}
	
	// return side c
	public double getSideC()
	{
		return sideC;
	}
}