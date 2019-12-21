/**
 * Creates outline for Homework objects
 * 
 * @author Zachary Gill
 * @version 04-18-2013
 */
public abstract class Homework
{
    private int pagesRead;
    private String typeHomework;
    
    /**
     * Constructor for objects of class Homework
     */
    public Homework()
    {
        pagesRead = 0;
        typeHomework = "none";
    }
    
    public abstract void createAssignment(int p);

    public int getPagesRead()
    {
        return pagesRead;
    }
    
    public String getTypeHomework()
    {
        return typeHomework;
    }
    
    public void setPagesRead(int p)
    {
        pagesRead = p;
    }
    
    public void setTypeHomework(String t)
    {
        typeHomework = t;
    }
}
