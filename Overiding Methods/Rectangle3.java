/**
 * Makes Rectangle3 objects.
 * 
 * @author Zachary Gill
 * @version 03-06-2013
 */
public class Rectangle3
{
    // instance variables 
    private int length;
    private int width;

    /**
     * Constructor for objects of class rectangle3
     */
    public Rectangle3(int l, int w)
    {
        // initialise instance variables
        length = l;
        width = w;
    }

    // return the height
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public String equals(Rectangle3 r)
    {
        String response = toString();
        if (r.getLength() == length && r.getWidth() == width)
            response = response + " is the same size as ";
        else
            response = response + " is not the same size as ";
        response = response + r;
        return response;
    }
    public String toString()
    {
        return "Rectangle - " + getLength() + " X " + getWidth();
    }
}
