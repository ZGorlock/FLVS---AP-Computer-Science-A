
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class a
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class a
     */
    public static void main(String [] args)
    {
        int[] a = {5, 9, 17, 12, 2, 14};
        
        sortStudios(a, 2);
        
    }

    public static int[] sortStudios(int[] movie, int order)
    {
        int i;
        int k;
        int posmax;
        int temp;
        for ( i = movie.length - 1 ; i >= 0 ; i-- )
        {
             posmax = 0;
             for ( k = 0 ; k <= i ; k++ )
             {
                 if (order == 1)
                 {
                    if ( movie[ k ] > movie[ posmax ])
                    posmax = k;
                }
                else if (order == 2)
                {
                    if ( movie[ k ] < movie[ posmax ])
                    posmax = k;
                }
             }
             temp = movie[ i ];
             movie[ i ] = movie[posmax ];
             movie[ posmax ] = temp;
             for (int b : movie)
                System.out.print(b + " ");
             System.out.println();
        }
        return movie;
    }

}
