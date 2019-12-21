import java.util.ArrayList;

/**
 * Creates polygon objects and displays their centers.
 * 
 * @author Zachary Gill
 * @version 03-04-2013
 */
public class TestPoly2
{
    /**
     * main method of class TestPoly2
     */
    public static void main(String [] args)
    {
        ArrayList<Circle2> circle = new ArrayList<Circle2>();
        
        circle.add(new Circle2(2, 4, 5));
        circle.add(new Cylinder2(10, 15, 4, 6));
        circle.add(new Oval2(25, 10, 4, 5));
        circle.add(new OvalCylinder2(40, 10, 6, 7, 10));
        
        for (Circle2 c : circle)
        {
            showCenter(c);
        }
    }

    /**
     * Prints the center of the object to the screen
     * 
     * @param c a Circle2 object
     */
    public static void showCenter(Circle2 c)
    {
        System.out.println("For " + c + " " + c.center());
    }
}
