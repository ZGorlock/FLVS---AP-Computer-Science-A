import java.util.ArrayList;
import java.util.Scanner;

/**
 * Uses the methods in PrimeNumbers to calculate prime numbers
 * 
 * @author Zachary Gill
 * @version 04-11-2013
 */
public class PrimeNumbersTester
{
    /**
     * Main method for PrimeNumbersTester
     */
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        int max = 1001;
        
        while (max > 1000)
        {
            System.out.print("Enter a number below 1000: ");
            max = in.nextInt();
        }
        
        PrimeNumbers pn = new PrimeNumbers(max);
        pn.findPrimes();
        primes = pn.getPrimes();
        
        System.out.println();
        System.out.println("Number of primes: " + primes.size());
        for (int prime : primes)
            System.out.print(prime + " ");
    }
}
