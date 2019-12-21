/**
 * Creates English Homework objects
 * 
 * @author Zachary Gill
 * @version 04-18-2013
 */
public class MyEnglish extends Homework
{
    /**
     * Constructor for objects of class MyEnglish
     */
    public MyEnglish()
    {
        super();
    }

    /**
     * Creates an english assignment
     */
    public void createAssignment(int p)
    {
        setPagesRead(p);
        setTypeHomework("English");
    }
    
    public String toString()
    {
        return getTypeHomework() + " - must read " + getPagesRead() + " pages";
    }
}
