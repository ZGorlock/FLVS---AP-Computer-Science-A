/**
 * Creates an election of Candidates
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class TestCandidate7
{
    /**
     * Main method for TestCandidate7
     */
    public static void main(String [] args)
    {
        Candidate[] election = new Candidate[10];
        election[0] = new Candidate("John Smith", 5000);
        election[1] = new Candidate("Mary Miller", 4000);
        election[2] = new Candidate("Michael Duffy", 6000);
        election[3] = new Candidate("Tim Robinson", 2500);
        election[4] = new Candidate("Joe Ashtony", 1800);
        election[5] = new Candidate("Mickey Jones", 3000);
        election[6] = new Candidate("Rebecca Morgan", 2000);
        election[7] = new Candidate("Kathleen Turner", 8000);
        election[8] = new Candidate("Tory Parker", 500);
        election[9] = new Candidate("Ashton Davis", 10000);
        
        System.out.println("Original results:");
        System.out.println();
        printResults(election);
        
        election = deleteByLoc(election, 6);
        System.out.println();
        printResults(election);
        
        election = deleteByName(election, "Kathleen Turner");
        System.out.println();
        printResults(election);
        
    }
    
    public static Candidate[] deleteByLoc(Candidate[] election, int pos)
    {
        Candidate[] temp = new Candidate[(election.length)];
        int rem = 0;
        for (int k = 0; k < election.length; k++)
        {
            if (k != pos)
            {
                temp[k] = election[k];
            }
            else
            {
                rem++;
                System.out.println("Removed " + election[k].getName());
            }
        }
        Candidate[] temp2 = new Candidate[(election.length - rem)];
        for (int k = 0; k < temp2.length; k++)
            temp2[k] = temp[k];
        if (rem == 0)
            System.out.println("Element does not exist.");
        return temp2;
    }
    
    public static Candidate[] deleteByName(Candidate[] election, String toFind)
    {
        Candidate[] temp = new Candidate[(election.length)];
        int rem = 0;
        for (int k = 0; k < election.length; k++)
        {
            if (election[k] != null)
            {
                if (election[k].getName().compareTo(toFind) != 0)
                    temp[k] = election[k];
                else
                {
                    rem++;
                    System.out.println("Removed " + toFind);
                }
            }
            else
                rem --;
        }
        Candidate[] temp2 = new Candidate[(election.length - rem)];
        for (int k = 0; k < temp2.length; k++)
            temp2[k] = temp[k];
        if (rem == 0)
            System.out.println(toFind + " does not exist.");
        return temp2;
    }
    
    public static Candidate[] insertPosition(Candidate[] election, int pos, Candidate insert)
    {
        System.out.println("Added " + insert.getName() + ", " + insert.getNumVotes() + " votes:");
        Candidate[] temp = new Candidate[(election.length + 1)];
        int k = 0;
        for (Candidate c : election)
        {
            temp[k] = c;
            k++;
        }
        for (int i = election.length - 1; i >= pos - 1; i--)
        {
            temp[i + 1] = election[i];
        }
        temp[pos - 1] = insert;
        return temp;
    }
    
    public static Candidate[] insertCandidate(Candidate[] election, String toFind, Candidate insert)
    {
        System.out.println("Added " + insert.getName() + ", " + insert.getNumVotes() + " votes:");
        Candidate[] temp = new Candidate[(election.length + 1)];
        int k = 0;
        for (Candidate c : election)
        {
            temp[k] = c;
            k++;
        }
        int i = 0;
        for (i = election.length - 1; i > - 1; i--)
        {
            temp[i + 1] = election[i];
            if (election[i].getName().equals(toFind))
                break;
        }
        temp[i] = insert;
        return temp;
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
            if (c != null)
                total = total + c.getNumVotes();
        return total;
    }
    
    public static void printResults(Candidate[] election)
    {
        System.out.printf("%-16s%-16s%-16s%n", "Candidate", "Votes Recieved", "% of Total Votes");
        for (Candidate c : election)
            if (c != null)
                System.out.printf("%-16s%-16d%-16.0f%n", c.getName(), c.getNumVotes(), (((double) c.getNumVotes() / getTotal(election)) * 100));
        System.out.println();
        System.out.println("Total number of votes in election: " + getTotal(election));
        System.out.println();
    }
    
    public static void replaceName(Candidate[] election, String toFind, String replace)
    {
        System.out.println("Changing " + toFind + " to " + replace);
        for (Candidate c : election)
            if (c.getName().equals(toFind))
                c.setName(replace);
    }
    
    public static void replaceVotes(Candidate[] election, String toFind, int replace)
    {
        System.out.println("Changing " + toFind + " votes to " + replace);
        for (Candidate c : election)
            if (c.getName().equals(toFind))
                c.setNumVotes(replace);
    }
    
    public static void replaceCandidate(Candidate[] election, String toFind, String replace1, int replace2)
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
