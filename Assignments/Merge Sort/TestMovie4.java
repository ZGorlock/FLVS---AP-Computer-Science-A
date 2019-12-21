/**
 * Uses merge sort method to sort an array of movies
 * 
 * @author Zachary Gill
 * @version 04-16-2013
 */
public class TestMovie4
{
    /**
     * Main method of TestMovie4
     */
    public static void main(String [] args)
    {
        String[] data1 = {"The Muppets Take Manhattan", "Mulan Special Edition", "Shrek 2", "The Incredibles", "Nanny McPhee", "The Curse ofthe Were-Rabbit", "Ice Age", "Lilo & Stitch", "Robots", "Monsters Inc."};
        int[] data2 = {2001, 2004, 2004, 2004, 2006, 2006, 2002, 2002, 2005, 2001};
        String[] data3 = {"Columbia Tristar", "Disney", "Dreamworks", "Pixar", "Universal", "Aardman", "20th Century Fox", "Disney", "20th Century Fox", "Pixar"};
        Movie4[] movie = new Movie4[10];
        for (int k = 0; k < data1.length; k++)
            movie[k] = new Movie4(data1[k], data2[k], data3[k]);
        System.out.println("Before Sorting:");
        printMovies(movie);
        System.out.println();
        System.out.println("Title Sort: Ascending:");
        printMovies(sortTitle(movie, 0, (movie.length - 1)));
        System.out.println();
        System.out.println("Year Sort: Descending:");
        printMovies(sortYear(movie, 0, (movie.length - 1)));
        System.out.println();
        System.out.println("Studio Sort: Ascending:");
        printMovies(sortStudio(movie, 0, (movie.length - 1)));
        System.out.println();
    }
    
    /**
     * Prints the movie array
     */
    public static void printMovies(Movie4[] movie)
    {
        for (Object m : movie)
            System.out.println(m);
    }
    
   public static Movie4[] sortStudio(Movie4[] a, int low, int high)
    {
        if ( low == high )
            return a;

        int mid = ( low + high ) / 2;

        sortStudio( a, low, mid ); 
        sortStudio( a, mid + 1, high); 

        mergeStudio( a, low, mid, high);
        
        return a;
    }  
    
    public static void mergeStudio( Movie4[] a, int low, int mid, int high )
    {
        Movie4[] temp = new Movie4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if ( a[ i ].getStudio().compareTo(a[ j ].getStudio()) < 0  )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];

    }
    
   public static Movie4[] sortTitle(Movie4[] a, int low, int high)
    {
        if ( low == high )
            return a;

        int mid = ( low + high ) / 2;

        sortTitle( a, low, mid ); 
        sortTitle( a, mid + 1, high); 

        mergeTitle( a, low, mid, high);
        
        return a;
    }  
    
    public static void mergeTitle( Movie4[] a, int low, int mid, int high )
    {
        Movie4[] temp = new Movie4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if ( a[ i ].getTitle().compareTo(a[ j ].getTitle()) < 0  )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];

    }
    
   public static Movie4[] sortYear(Movie4[] a, int low, int high)
    {
        if ( low == high )
            return a;

        int mid = ( low + high ) / 2;

        sortYear( a, low, mid ); 
        sortYear( a, mid + 1, high); 

        mergeYear( a, low, mid, high);
        
        return a;
    }  
    
    public static void mergeYear( Movie4[] a, int low, int mid, int high )
    {
        Movie4[] temp = new Movie4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while ( i <= mid || j <= high )
        {
            if ( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if ( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if ( a[ i ].getYear() > a[ j ].getYear() )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }

        for ( int k = low ; k <= high ; k++ )
            a[ k ] = temp[ k - low ];

    }
}