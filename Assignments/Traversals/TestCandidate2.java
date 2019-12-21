import java.util.ArrayList;
/**
 * Creates an election of Candidates
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class TestCandidate2
{
    /**
     * Main method for TestCandidate2
     */
    public static void main(String [] args)
    {
        ArrayList<Candidate> election = new ArrayList<Candidate>(5);
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));
        
        printVotes(election);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
    }
    
    public static void printVotes(ArrayList<Candidate> election)
    {
        System.out.println("Results per candidate:");
        System.out.println("======================");
        for (Candidate c : election)
            System.out.println(c);
    }
    
    public static int getTotal(ArrayList<Candidate> election)
    {
        int total = 0;
        for (Candidate c : election)
            total = total + c.getNumVotes();
        return total;
    }
    
    public static void printResults(ArrayList<Candidate> election)
    {
        System.out.printf("%-16s%-16s%-16s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        for (Candidate c : election)
            System.out.printf("%-16s%-16d%-16.0f%n", c.getName(), c.getNumVotes(), (((double) c.getNumVotes() / getTotal(election)) * 100));
    }
}
