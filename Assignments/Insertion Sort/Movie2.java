/**
 * Creates Movie2 objects
 * 
 * @author Zachary Gill
 * @version 04-15-2013
 */
public class Movie2
{
    private String title;
    private int year;
    private String studio;
    
    /**
     * Constructor for objects of class Movie2
     */
    public Movie2(String t, int y, String s)
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
