/**
 * Forrest terrain.
 * 
 * @author Zachary Gill
 * @version 03-03-2013
 */
public class Forrest extends Terrain
{
    // instance variables - replace the example below with your own
    private int trees;

    /**
     * Constructor for objects of class Mountain
     */
    public Forrest(int l, int w, int t)
    {
        // initialise instance variables
        super (l, w);
        trees = t;
    }

    /**
     * Getter method for number of trees.
     * 
     * @return number of trees
     */
    public int getTree()
    {
        return trees;
    }
}
