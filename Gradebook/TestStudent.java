import java.util.ArrayList;
/**
 * Creates a gradebook.
 * 
 * @author Zachary Gill
 * @version 04-28-2013
 */
public class TestStudent
{
    /**
     * Main method of TestStudent
     */
    public static void main(String [] args)
    {
        ArrayList<Student> myClass = new ArrayList<Student>(5);
        myClass.add(new Student("Mark Kennedy", 70, 80, 90, 100, 90));
        myClass.add(new Student("Max Gerard", 80, 85, 90, 85, 80));
        myClass.add(new Student("Jean Smith", 50, 79, 89, 99, 100));
        myClass.add(new Student("Betty Farm", 85, 80, 85, 88, 89));
        myClass.add(new Student("Dilbert Gamma", 70, 70, 90, 70, 80));
        
        System.out.println("Starting Gradebook:");
        System.out.println();
        printBook(myClass);
        
        myClass = replaceName(myClass, "Betty Farm", "Betty Boop");
        myClass = replaceQuiz(myClass, "Jean Smith", 1, 80);
        myClass = replaceStudent(myClass, "Dilbert Gamma", "Mike Kappa", 80, 80, 80, 90, 90);
        myClass = insertStudent(myClass, "Betty Farm", "Lily Mu", 85, 95, 70, 0, 100);
        myClass = deleteStudent(myClass, "Max Gerard");
    }
    
    public static void printBook(ArrayList<Student> a)
    {
        System.out.printf("%-16s%-5s%-5s%-5s%-5s%-5s%n", "Student Name", "Q1", "Q2", "Q3", "Q4", "Q5");
        System.out.println("---------------------------------");
        for (Student s : a)
            System.out.println(s);
    }
    
    public static ArrayList<Student> replaceName(ArrayList<Student> a, String toFind, String replace)
    {
        System.out.println();
        System.out.println("Changing " + toFind + "'s name to " + replace + ":");
        for (int k = 0; k < a.size(); k++)
        {
            if (a.get(k).getName().equals(toFind))
                a.get(k).setName(replace);
        }
        
        System.out.println();
        printBook(a);
        
        return a;
    }
    
    public static ArrayList<Student> replaceQuiz(ArrayList<Student> a, String toFind, int which, int grade)
    {
        System.out.println();
        System.out.println("Changing " + toFind + "'s quiz " + which + " score to " + grade + ":");
        for (int k = 0; k < a.size(); k++)
        {
            if (a.get(k).getName().equals(toFind))
                a.get(k).setQuiz(which, grade);
        }
        
        System.out.println();
        printBook(a);
        
        return a;
    }
    
    public static ArrayList<Student> replaceStudent(ArrayList<Student> a, String toFind, String replace, int q1, int q2, int q3, int q4, int q5)
    {
        System.out.println();
        System.out.println("Replacing " + toFind + " with " + replace + ": " + q1 + ", " + q2 + ", " + q3 + ", " + q4 + ", " + q5 + ":");
        for (int k = 0; k < a.size(); k++)
        {
            if (a.get(k).getName().equals(toFind))
                a.set(k, new Student(replace, q1, q2, q3, q4, q5));
        }
        
        System.out.println();
        printBook(a);
        
        return a;
    }
    
    public static ArrayList<Student> insertStudent(ArrayList<Student> a, String before, String name, int q1, int q2, int q3, int q4, int q5)
    {
        System.out.println();
        System.out.println("Inserting " + name + ": " + q1 + ", " + q2 + ", " + q3 + ", " + q4 + ", " + q5 + " before " + before + ":");
        for (int k = 0; k < a.size(); k++)
        {
            if (a.get(k).getName().equals(before))
                a.add(k, new Student(name, q1, q2, q3, q4, q5));
        }
        
        System.out.println();
        printBook(a);
        
        return a;
    }
    
    public static ArrayList<Student> deleteStudent(ArrayList<Student> a, String toFind)
    {
        System.out.println();
        System.out.println("Deleting " + toFind + ":");
        for (int k = 0; k < a.size(); k++)
        {
            if (a.get(k).getName().equals(toFind))
                a.remove(k);
        }
        
        System.out.println();
        printBook(a);
        
        return a;
    }
}
