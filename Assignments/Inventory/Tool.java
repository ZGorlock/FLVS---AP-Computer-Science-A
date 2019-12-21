/**
 * Creates outline for Tool objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public class Tool implements Product, Comparable<Tool>
{
    private String name;
    private double cost;

    /**
     * Constructor for objects of class Tool
     */
    public Tool(String n, double c)
    {
        name = n;
        cost = c;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int compareTo(Tool t)
    {
        if (cost < t.getCost())
            return -1;
        else if (cost == t.getCost())
            return 0;
        else
            return 1;
    }
}
