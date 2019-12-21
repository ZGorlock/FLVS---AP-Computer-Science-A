/**
 * Creates Music2 objects
 * 
 * @author Zachary Gill
 * @version 04-25-2013
 */
public class Music2
{
    private String title;
    private int year;
    private String singer;

    /**
     * Constructor for objects of class Music2
     */
    public Music2(String t, int y, String s)
    {
        title = t;
        year = y;
        singer = s;
    }

    /**
     * Overriden toString{} method
     * 
     * @return <title>, <year>, <singer>
     */
    public String toString()
    {
        return title + ", " + year + ", " + singer;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public String getSinger()
    {
        return singer;
    }
}
