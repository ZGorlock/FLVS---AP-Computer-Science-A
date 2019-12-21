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
        english.createAssignment(10);
        
        MyJava java = new MyJava();
        java.createAssignment(5);
        
        homework.add(math);
        homework.add(science);
        homework.add(english);
        homework.add(java);
        
        for (Homework h : homework)
        {
            System.out.println("Before reading:");
            System.out.println(h);
            System.out.println("After reading:");
            h.doReading();
            System.out.println(h);
        }
    }
}
