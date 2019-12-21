/**
 * Creates Java Homework objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public class MyJava extends Homework
{
    /**
     * Constructor for objects of class MyJava
     */
    public MyJava()
    {
        super();
    }

    /**
     * Creates a science assignment
     */
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("Java");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages";
    }
    
    public void doReading()
    {
        setPagesRead(getPagesRead() - 4);
    }
}
