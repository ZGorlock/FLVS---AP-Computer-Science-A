/**
 * Tests overriding methods in classes.
 * 
 * @author Zachary Gill
 * @version 03-06-2013
 */
public class Test
{
	public static void main (String []args)
	{
	    Rectangle3 one = new Rectangle3(5, 20);
	    Box3 two = new Box3(4, 4, 4);
	    Box3 three = new Box3(4, 10, 5);
	    Cube3 four = new Cube3(4);
	    
	    System.out.println(one);
	    System.out.println(two);
	    System.out.println(three);
	    System.out.println(four);
	    System.out.println(two.equals(four));
	    System.out.println(three.equals(four));
	}
	
}
