/**
 * Class to solve question 2 on Worksheet
 * 
 * @author Zachary Gill
 * @version 02-17-2013
 */
public class f2
{
    /**
     * Constructor for objects of class f2
     */
    public f2()
    {
    }
    
    /**
     * Recursive mutator method to solve the problem
     * 
     * @param a the value we are solving the function for
     * 
     * @return the solution to the function
     */
    public int f(int a)
    {
        if (a > 25)
            return f((a / 12) + 5) - 3;
        else
            return 20;
    }
}
