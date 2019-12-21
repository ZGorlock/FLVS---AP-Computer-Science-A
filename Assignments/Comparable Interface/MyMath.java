/**
 * Creates Math Homework objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public class MyMath extends Homework
{
    /**
     * Constructor for objects of class MyMath
     */
    public MyMath()
    {
        super();
    }

    /**
     * Creates a math assignment
     */
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Math");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 2);
    }
}
