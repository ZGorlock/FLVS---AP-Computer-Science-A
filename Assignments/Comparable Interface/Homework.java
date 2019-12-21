/**
 * Creates outline for Homework objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public abstract class Homework implements Processing, Comparable<Homework>
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
    
    public int compareTo(Homework h)
    {
        if (pagesRead < h.getPagesRead())
            return -1;
        else if (pagesRead == h.getPagesRead())
            return 0;
        else
            return 1;
    }
}
