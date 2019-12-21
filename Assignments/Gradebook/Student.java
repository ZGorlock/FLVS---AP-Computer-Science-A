/**
 * Creates Student objects
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class Student
{
    private String name;
    private int qz1;
    private int qz2;
    private int qz3;
    private int qz4;
    private int qz5;

    /**
     * Constructor for objects of class Student
     */
    public Student(String n, int q1, int q2, int q3, int q4, int q5)
    {
        name = n;
        qz1 = q1;
        qz2 = q2;
        qz3 = q3;
        qz4 = q4;
        qz5 = q5;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public int getQuiz(int q)
    {
        if (q == 1)
            return qz1;
        else if (q == 2)
            return qz2;
        else if (q == 3)
            return qz3;
        else if (q == 4)
            return qz4;
        else if (q == 5)
            return qz5;
        else
            return 0;
    }
    
    public void setQuiz(int q, int qz)
    {
        if (q == 1)
            qz1 = qz;
        else if (q == 2)
            qz2 = qz;
        else if (q == 3)
            qz3 = qz;
        else if (q == 4)
            qz4 = qz;
        else if (q == 5)
            qz5 = qz;
    }

    /**
     * Overwritten toString() method
     * 
     * @return <name> <qz1> <qz2> <qz3> <qz4> <qz5>
     */
    public String toString()
    {
        return String.format("%-16s%-5d%-5d%-5d%-5d%-5d", name, qz1, qz2, qz3, qz4, qz5);
    }
}
