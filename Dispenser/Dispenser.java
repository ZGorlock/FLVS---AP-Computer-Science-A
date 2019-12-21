
/**
 * Write a description of class Dispenser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dispenser
{
    private int numberOfItems;
    private int cost;

    /**
     * Default constructor for objects of class Dispenser
     */
    public Dispenser()
    {
        numberOfItems = 50;
    }

    /**
     * Constructor for objects of class Dispenser
     */
    public Dispenser(int n, int c)
    {
        if (n < 0 || c < 0)
            throw new IllegalArgumentException("numberOfItems and Cost must be >= 0");
        numberOfItems = n;
        cost = c;
    }
    
    public int getCount()
    {
        return numberOfItems;
    }
    
    public int getProductCost()
    {
        return cost;
    }
    
    public void makeSale()
    {
        numberOfItems--;
    }
}
