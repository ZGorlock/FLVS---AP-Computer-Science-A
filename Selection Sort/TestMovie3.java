/**
 * Uses insertion sort method to sort an array of movies
 * 
 * @author Zachary Gill
 * @version 04-15-2013
 */
public class TestMovie3
{
    /**
     * Main method of TestMovie3
     */
    public static void main(String [] args)
    {
        String[] data1 = {"The Muppets Take Manhattan", "Mulan Special Edition", "Shrek 2", "The Incredibles", "Nanny McPhee", "The Curse ofthe Were-Rabbit", "Ice Age", "Lilo & Stitch", "Robots", "Monsters Inc."};
        int[] data2 = {2001, 2004, 2004, 2004, 2006, 2006, 2002, 2002, 2005, 2001};
        String[] data3 = {"Columbia Tristar", "Disney", "Dreamworks", "Pixar", "Universal", "Aardman", "20th Century Fox", "Disney", "20th Century Fox", "Pixar"};
        Movie3[] movie = new Movie3[10];
        for (int k = 0; k < data1.length; k++)
            movie[k] = new Movie3(data1[k], data2[k], data3[k]);
        System.out.println("Before Sorting:");
        printMovies(movie);
        System.out.println();
        System.out.println("Title Sort: Ascending:");
        printMovies(sortTitles(movie, 1));
        System.out.println();
        System.out.println("Title Sort: Descending:");
        printMovies(sortTitles(movie, 2));
        System.out.println();
        System.out.println("Year Sort: Ascending:");
        printMovies(sortYears(movie, 1));
        System.out.println();
        System.out.println("Year Sort: Descending:");
        printMovies(sortYears(movie, 2));
        System.out.println();
        System.out.println("Studio Sort: Ascending:");
        printMovies(sortStudios(movie, 1));
        System.out.println();
        System.out.println("Studio Sort: Descending:");
        printMovies(sortStudios(movie, 2));
    }
    
    /**
     * Prints the movie array
     */
    public static void printMovies(Movie3[] movie)
    {
        for (Object m : movie)
            System.out.println(m);
    }
    
    public static Movie3[] sortStudios(Movie3[] movie, int order)
    {
        int i;
        int k;
        int posmax;
        Movie3 temp;
        for ( i = movie.length - 1 ; i >= 0 ; i-- )
        {
             posmax = 0;
             for ( k = 0 ; k <= i ; k++ )
             {
                 if (order == 1)
                 {
                    if ( movie[ k ].getStudio().compareTo(movie[ posmax ].getStudio()) > 0 )
                    posmax = k;
                }
                else if (order == 2)
                {
                    if ( movie[ k ].getStudio().compareTo(movie[ posmax ].getStudio()) < 0 )
                    posmax = k;
                }
             }
             temp = movie[ i ];
             movie[ i ] = movie[posmax ];
             movie[ posmax ] = temp;
        }
        return movie;
    }
    
    public static Movie3[] sortTitles(Movie3[] movie, int order)
    {
        int i;
        int k;
        int posmax;
        Movie3 temp;
        for ( i = movie.length - 1 ; i >= 0 ; i-- )
        {
             posmax = 0;
             for ( k = 0 ; k <= i ; k++ )
             {
                 if (order == 1)
                 {
                    if ( movie[ k ].getTitle().compareTo(movie[ posmax ].getTitle()) > 0 )
                    posmax = k;
                }
                else if (order == 2)
                {
                    if ( movie[ k ].getTitle().compareTo(movie[ posmax ].getTitle()) < 0 )
                    posmax = k;
                }
             }
             temp = movie[ i ];
             movie[ i ] = movie[posmax ];
             movie[ posmax ] = temp;
        }
        return movie;
    }
    
    public static Movie3[] sortYears(Movie3[] movie, int order)
    {
        int i;
        int k;
        int posmax;
        Movie3 temp;
        for ( i = movie.length - 1 ; i >= 0 ; i-- )
        {
             posmax = 0;
             for ( k = 0 ; k <= i ; k++ )
             {
                 if (order == 1)
                 {
                    if ( movie[ k ].getYear() > movie[ posmax ].getYear() )
                    posmax = k;
                }
                else if (order == 2)
                {
                    if ( movie[ k ].getYear() < movie[ posmax ].getYear() )
                    posmax = k;
                }
             }
             temp = movie[ i ];
             movie[ i ] = movie[posmax ];
             movie[ posmax ] = temp;
        }
        return movie;
    }
}