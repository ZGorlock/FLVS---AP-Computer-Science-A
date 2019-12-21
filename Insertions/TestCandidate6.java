import java.util.ArrayList;
/**
 * Creates an election of Candidates
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class TestCandidate6
{
    /**
     * Main method for TestCandidate6
     */
    public static void main(String [] args)
    {
        ArrayList<Candidate> election = new ArrayList<Candidate>(10);
        election.add(new Candidate("John Smith", 5000));
        election.add(new Candidate("Mary Miller", 4000));
        election.add(new Candidate("Michael Duffy", 6000));
        election.add(new Candidate("Tim Robinson", 2500));
        election.add(new Candidate("Joe Ashtony", 1800));
        election.add(new Candidate("Mickey Jones", 3000));
        election.add(new Candidate("Rebecca Morgan", 2000));
        election.add(new Candidate("Kathleen Turner", 8000));
        election.add(new Candidate("Tory Parker", 500));
        election.add(new Candidate("Ashton Davis", 10000));
        
        System.out.println("Original results:");
        System.out.println();
        printResults(election);
        
        election = insertPosition(election, 4, new Candidate("Mickey Duck", 14000));
        System.out.println();
        printResults(election);
        
        election = insertPositionGet(election, "Kathleen Turner", new Candidate("Donald Mouse", 100));
        System.out.println();
        printResults(election);
        
    }
    
    public static ArrayList<Candidate> insertPosition(ArrayList<Candidate> election, int pos, Candidate insert)
    {
        System.out.println("Added " + insert.getName() + ", " + insert.getNumVotes() + " votes:");
        ArrayList<Candidate> temp = election;
        temp.add(pos, insert);
        return temp;
    }
    
    public static ArrayList<Candidate> insertPositionGet(ArrayList<Candidate> election, String toFind, Candidate insert)
    {
        ArrayList<Candidate> temp = election;
        int found = 0;
        for (int i = 0; i < election.size(); i++)
        {
            if (election.get(i).getName().equals(toFind))
            {
                found++;
                temp = insertPosition(temp, i, insert);
                break;
            }
        }
        return temp;
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
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
    }
    
    public static void replaceName(ArrayList<Candidate> election, String toFind, String replace)
    {
        System.out.println("Changing " + toFind + " to " + replace);
        for (Candidate c : election)
            if (c.getName().equals(toFind))
                c.setName(replace);
    }
    
    public static void replaceVotes(ArrayList<Candidate> election, String toFind, int replace)
    {
        System.out.println("Changing " + toFind + " votes to " + replace);
        for (Candidate c : election)
            if (c.getName().equals(toFind))
                c.setNumVotes(replace);
    }
    
    public static void replaceCandidate(ArrayList<Candidate> election, String toFind, String replace1, int replace2)
    {
        System.out.println("Replacing " + toFind + " with " + replace1);
        for (Candidate c : election)
            if (c.getName().equals(toFind))
            {
                c.setName(replace1);
                c.setNumVotes(replace2);
            }
    }
}
