import java.util.ArrayList;

/**
 * Contains methods to calculate prime numbers
 * 
 * @author Zachary Gill
 * @version 04-11-2013
 */
public class PrimeNumbers
{
    private int max;
    private ArrayList<Integer> primes = new ArrayList<Integer>();

    /**
     * Constructor for objects of class PrimeNumbers
     * 
     * @param  max  the max number to look for prime numbers
     */
    public PrimeNumbers(int max)
    {
        this.max = max;
    }

    /**
     * Checks for prime numbers between 1 and max
     */
    public void findPrimes()
    {
        for (int k = 1; k < max; k++)
        {
            boolean isPrime = true;
            int numFactor = 0;
            for (int j = 1; j < k; j++)
                if (k % j == 0)
                    numFactor++;
            if (numFactor == 1)
                primes.add(k);
        }
    }
    
    /**
     * Returns the primes ArrayList
     * 
     * @return primes ArrayList of prime numbers
     */
    public ArrayList<Integer> getPrimes()
    {
        return primes;
    }
}
