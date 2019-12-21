/** Creates StudentData objects
 * 
 * @author Zachary Gill
 * @version 04-27-2013
 */
public class StudentData
{
    private String firstName;
    private String lastName;
    private double[] testScores ;
    private char grade;

    /**
     * Constructor for objects of class StudentData
     */
    public StudentData(String fn, String ln, double[] ts)
    {
        if (fn.equals("") || ln.equals(""))
            throw new IllegalArgumentException("firstName and lastName must not have empty values");
        else
        {
            firstName = fn;
            lastName = ln;
            testScores = ts;
            grade = courseGrade(testScores);
        }
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public double[] getTestScores()
    {
        return testScores;
    }
    
    public char getGrade()
    {
        return grade;
    }

    /**
     * Overwritten toString() class
     * 
     * @return <firstName> <lastName> <testScores[0]> <testScores[1]> <testScores[2]> <testScores[3]> <testScores[4]> <testScores[0]> <grade>
     */
    public String toString()
    {
        String a = "";
        a = String.format("%-10s%-10s", getFirstName(), getLastName());
        for (double d : getTestScores())
            a = a + String.format("%-6.2f", d);
        a = a + String.format("%3s", getGrade());
        return a;
    }
    
    public char courseGrade(double [] list)
    {
        double total = 0;
        for (double g : list)
            total = total + g;
        if (total == 0)
            throw new IllegalArgumentException("Grade list can not be empty");
        if (total < 60)
            return 'F';
        else if (total < 70)
            return 'D';
        else if (total < 80)
            return 'C';
        else if (total < 90)
            return 'B';
        else
            return 'A';
        }
}
