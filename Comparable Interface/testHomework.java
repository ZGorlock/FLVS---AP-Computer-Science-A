import java.util.ArrayList;

/**
 * Creates Homework assignments using Homework objects
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public class testHomework
{
    /**
     * main method for testHomewrok class
     */
    public static void main(String [] args)
    {
        ArrayList<Homework> homework = new ArrayList<Homework>();
        
        MyMath math = new MyMath();
        math.createAssignment(4);
        
        MyScience science = new MyScience();
        science.createAssignment(6);
        
        MyEnglish english = new MyEnglish();
        english.createAssignment(4);
        
        MyJava java = new MyJava();
        java.createAssignment(5);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for (Homework h : homework)
        {
            System.out.println(h);
        }
        
        compareHomework(homework.get(0), homework.get(2));
    }
    
    public static void compareHomework(Homework a, Homework b)
    {
        int c = a.compareTo(b);
        if (c == 0)
            System.out.println("The homework for " + a.getTypeHomework() + " and " + b.getTypeHomework() + " are the same number of pages");
        else if (c == 1)
            System.out.print("The homework for " + a.getTypeHomework() + " is less than the homework for " + b.getTypeHomework());
        else
            System.out.print("The homework for " + a.getTypeHomework() + " is less than the homework for " + b.getTypeHomework());
        
    }
}
