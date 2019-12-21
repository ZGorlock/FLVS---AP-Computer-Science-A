/**
 * Creates Science Homework objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public class MyScience extends Homework
{
    /**
     * Constructor for objects of class MyScience
     */
    public MyScience()
    {
        super();
    }

    /**
     * Creates a science assignment
     */
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Science");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 3);
    }
}
