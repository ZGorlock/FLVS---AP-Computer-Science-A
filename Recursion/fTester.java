/**
 * Solves the problems from the Worksheet using its linked classes.
 * 
 * @author Zachary Gill
 * @version 02-17-2013
 */
public class fTester
{
    public static void main(String [] args)
    {
        f1 problem1 = new f1();
        f2 problem2 = new f2();
        f4 problem4 = new f4();
        
        System.out.println(problem1.f(25));
        System.out.println(problem2.f(30));
        System.out.println(problem4.f(500));
    }
}
