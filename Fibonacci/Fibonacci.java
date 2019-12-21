import java.util.Scanner;
/**
 * calculates the n-th Fibonacci number specified by the user
 * 
 * Zachary Gill
 * 02-19-2013
 */
public class Fibonacci
{
    /**
     * calulated the num-th Fibonacci number
     * 
     * @param n the number from the Fibonacci sequence being found
     * 
     * @return the Fibonacci number
     */
    public static int fibNum(int n)
    {
        if (n > 1)
            return fibNum(n - 1) + fibNum(n - 2);
        else
            return n;        
    }
    
    /**
     * the main method for the Fibonacci class
     */    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        
        System.out.println("Enter n to find the n-th Fibonacci number.");
        System.out.println("n must be between 0 and 45.");
        System.out.println("Enter -1 to exit the program.");
        
        while (n > -1)
        {
            System.out.print(": ");
            n = in.nextInt();
            if (n >= 0 && n <= 45)
                System.out.println("Fibonacci term: " + n + " = " + fibNum(n));
            else if (n >= 0)
                System.out.println("outside range of valid input");
        }
    }
}
