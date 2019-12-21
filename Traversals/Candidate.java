/**
 * Creates Candidate objects
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class Candidate
{
    private String name;
    private int numVotes;

    /**
     * Constructor for objects of class Candidate
     */
    public Candidate(String n, int v)
    {
        name = n;
        numVotes = v;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getNumVotes()
    {
        return numVotes;
    }

    /**
     * Overwritten toString() method
     * 
     * @return <name> recieved <numVotes> votes.
     */
    public String toString()
    {
        return name + " recieved " + numVotes + " votes.";
    }
}
