import java.util.ArrayList;

/**
 * Uses insertion sort method to sort an array of movies
 * 
 * @author Zachary Gill
 * @version 04-15-2013
 */
public class TestMovie2
{
    /**
     * Main method of TestMovie2
     */
    public static void main(String [] args)
    {
        String[] data1 = {"The Muppets Take Manhattan", "Mulan Special Edition", "Shrek 2", "The Incredibles", "Nanny McPhee", "The Curse ofthe Were-Rabbit", "Ice Age", "Lilo & Stitch", "Robots", "Monsters Inc."};
        int[] data2 = {2001, 2004, 2004, 2004, 2006, 2006, 2002, 2002, 2005, 2001};
        String[] data3 = {"Columbia Tristar", "Disney", "Dreamworks", "Pixar", "Universal", "Aardman", "20th Century Fox", "Disney", "20th Century Fox", "Pixar"};
        Movie2[] movie = new Movie2[10];
        for (int k = 0; k < data1.length; k++)
            movie[k] = new Movie2(data1[k], data2[k], data3[k]);
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
    public static void printMovies(Movie2[] movie)
    {
        for (Object m : movie)
            System.out.println(m);
    }
    
    public static Movie2[] sortStudios(Movie2[] movie, int order)
    {
        Movie2[] studioSort = new Movie2[10];
        for (int i = 0 ; i < movie.length ; i++)
        {
            Movie2 next = movie[i];
            int insertindex = 0;
            int k = i;
            while (k > 0 && insertindex == 0)
            {
                if (order == 1)
                {
                    if (next.getStudio().compareTo(studioSort[k - 1].getStudio()) > 0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        studioSort[k] = studioSort[k - 1];
                    }
                    k--;
                }
                else if (order == 2)
                {
                    if (next.getStudio().compareTo(studioSort[k - 1].getStudio()) < 0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        studioSort[k] = studioSort[k - 1];
                    }
                    k--;
                }
            }
            studioSort[insertindex] = next;
       }
       return studioSort;
    }
    
    public static Movie2[] sortTitles(Movie2[] movie, int order)
    {
        Movie2[] titleSort = new Movie2[10];
        for (int i = 0 ; i < movie.length ; i++)
        {
            Movie2 next = movie[i];
            int insertindex = 0;
            int k = i;
            while (k > 0 && insertindex == 0)
            {
                if (order == 1)
                {
                    if (next.getTitle().compareTo(titleSort[k - 1].getTitle()) > 0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        titleSort[k] = titleSort[k - 1];
                    }
                    k--;
                }
                else if (order == 2)
                {
                    if (next.getTitle().compareTo(titleSort[k - 1].getTitle()) < 0)
                    {
                        insertindex = k;
                    }
                    else
                    {
                        titleSort[k] = titleSort[k - 1];
                    }
                    k--;
                }
            }
            titleSort[insertindex] = next;
       }
       return titleSort;
    }
    
        public static Movie2[] sortYears(Movie2[] movie, int order)
    {
        Movie2[] yearSort = new Movie2[10];
        for (int i = 0 ; i < movie.length ; i++)
        {
            Movie2 next = movie[i];
            int insertindex = 0;
            int k = i;
            while (k > 0 && insertindex == 0)
            {
                if (order == 1)
                {
                    if (next.getYear() > yearSort[k - 1].getYear())
                    {
                        insertindex = k;
                    }
                    else
                    {
                        yearSort[k] = yearSort[k - 1];
                    }
                    k--;
                }
                else if (order == 2)
                {
                    if (next.getYear() < yearSort[k - 1].getYear())
                    {
                        insertindex = k;
                    }
                    else
                    {
                        yearSort[k] = yearSort[k - 1];
                    }
                    k--;
                }
            }
            yearSort[insertindex] = next;
       }
       return yearSort;
    }
}
