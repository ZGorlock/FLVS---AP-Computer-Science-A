/**
 * Creates outline for Vehicle objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public abstract class Vehicle implements Product
{
    private String name;
    private double cost;

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle()
    {
        name = "none";
        cost = 0;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setCost(double c)
    {
        cost = c;
    }
}
