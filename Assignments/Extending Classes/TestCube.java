/**
 * test program for cube
 * 
 * @author Zachary Gill
 * @version 02-25-2013
 */
public class TestCube
{
	public static void main (String []args)
	{
	    Rectangle one = new Rectangle(2, 4);
	    Box two = new Box(4,10,4);
	    Cube three = new Cube(4);
	    
	    System.out.println("One's dimensions are " + one.getLength() + " X " + one.getWidth());
	    System.out.println("Cube's dimensions are " + three.getLength() + " X " + three.getWidth() + " X " + three.getHeight());
	}
	
}
