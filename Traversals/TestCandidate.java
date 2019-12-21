/**
 * Creates an election of Candidates
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class TestCandidate
{
    /**
     * Main method for TestCandidate
     */
    public static void main(String [] args)
    {
        Candidate[] election = new Candidate[5];
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        
        printVotes(election);
        System.out.println();
        printResults(election);
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
    }
    
    public static void printVotes(Candidate[] election)
    {
        System.out.println("Results per candidate:");
        System.out.println("======================");
        for (Candidate c : election)
            System.out.println(c);
    }
    
    public static int getTotal(Candidate[] election)
    {
        int total = 0;
        for (Candidate c : election)
            total = total + c.getNumVotes();
        return total;
    }
    
    public static void printResults(Candidate[] election)
    {
        System.out.printf("%-16s%-16s%-16s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        for (Candidate c : election)
            System.out.printf("%-16s%-16d%-16.0f%n", c.getName(), c.getNumVotes(), (((double) c.getNumVotes() / getTotal(election)) * 100));
    }
}
