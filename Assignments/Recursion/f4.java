/**
 * Class to solve question 4 on Worksheet
 * 
 * @author Zachary Gill
 * @version 02-17-2013
 */
public class f4
{
    /**
     * Constructor for objects of class f4
     */
    public f4()
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
        if (a <= 20)
            return f(a * 2) - 4;
        else
            return -100;
    }
}
