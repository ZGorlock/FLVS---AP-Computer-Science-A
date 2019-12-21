/**
 * Class to solve question 1 on Worksheet
 * 
 * @author Zachary Gill
 * @version 02-17-2013
 */
public class f1
{
    /**
     * Constructor for objects of class f1
     */
    public f1()
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
        if (a > 10)
            return f(a - 4) + 2;
        else
            return -7;
    }
}
