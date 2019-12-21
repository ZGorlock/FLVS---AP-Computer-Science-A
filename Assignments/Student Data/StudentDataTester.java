/**
 * Tests exception handling using the StudentData class.
 * 
 * @author Zachary Gill
 * @version 04-27-2013
 */
public class StudentDataTester
{
    /**
     * Main method for StudentDataTester
     */
    public static void main(String [] args)
    {
        //double[] agrade =  {89.00, 78.00, 95.00, 63.00, 94.00};
        //StudentData a = new StudentData("John", "Doe", agrade);
        //System.out.println(a);
        
        //double[] agrade =  {89.00, 78.00, 95.00, 63.00, 94.00};
        //StudentData a = new StudentData("John", "", agrade);
        //System.out.prinln(a);
        
        //double[] agrade =  {89.00, 78.00, 95.00, 63.00, 94.00};
        //StudentData a = new StudentData("John", "Doe", agrade);
        //System.out.println(a);
        
        double[] agrade =  {};
        StudentData a = new StudentData("John", "Doe", agrade);
        System.out.println(a);
    }
}
