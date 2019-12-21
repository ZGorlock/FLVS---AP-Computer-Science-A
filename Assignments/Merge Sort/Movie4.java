/**
 * Creates Movie4 objects
 * 
 * @author Zachary Gill
 * @version 04-16-2013
 */
public class Movie4
{
    private String title;
    private int year;
    private String studio;
    
    /**
     * Constructor for objects of class Movie4
     */
    public Movie4(String t, int y, String s)
    {
        title = t;
        year = y;
        studio = s;
    }
    
    /**
     * Returns the studio
     * 
     * @return studio
     */
    public String getStudio()
    {
        return studio;
    }
    
    /**
     * Returns the title
     * 
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Returns the year
     * 
     * @return year
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Overriden toString() method
     * 
     * @return <title>, <year>, <studio>
     */
    public String toString()
    {
        return title + ", " + year + ", " + studio;
    }
}
