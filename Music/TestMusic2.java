/**
 * Searches through a list of Music2 objects.
 * 
 * @author Zachary Gill
 * @version 04-25-2013
 */
public class TestMusic2
{
    /**
     * Main method of TestMusic2
     */
    public static void main(String [] args)
    {
        Music2[] myMusic = new Music2[10];
        myMusic[0] = new Music2("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music2("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music2("What Is It's You", 1995, "Reba McEntire");
        myMusic[3] = new Music2("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music2("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music2("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music2("Under My Skin", 2004, "Avril Lavigne");
        myMusic[7] = new Music2("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music2("Let It Go", 2007, "Tim McGraw");
        myMusic[9] = new Music2("White Flag", 2004, "Dido");
        
        mergeSortSort(myMusic, 0, myMusic.length-1);
        printMusic(myMusic);
        System.out.println();
        searchTitle(myMusic, "Misunderstood");
        System.out.println();
        searchTitle(myMusic, "Under Paid");
        System.out.println();
        searchYear(myMusic, 2005);
        System.out.println();
        searchYear(myMusic, 2006);
        System.out.println();
        searchSinger(myMusic, "Darth Maul");
        System.out.println();
        searchSinger(myMusic, "Dido");
    }
    
    public static void printMusic(Music2[] myMusic)
    {
        System.out.println("Music library:");
        System.out.println("--------------");
        for (Music2 m : myMusic)
            System.out.println(m);
    }
    
   public static Music2[] mergeSortSort (Music2[] a, int low, int high)
    {
        if ( low == high )
            return a;

        int mid = ( low + high ) / 2;

        mergeSortSort( a, low, mid); 
        mergeSortSort( a, mid + 1, high); 

        mergeSortMerge( a, low, mid, high);
        
        return a;
    }  
    
    public static void mergeSortMerge( Music2[] a, int low, int mid, int high )
    {
        Music2[] temp = new Music2[ high - low + 1 ];

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
            else if (a[i].getTitle().compareTo(a[j].getTitle()) < 0)
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
    
    public static void searchTitle(Music2[] r, String toFind)
    {
        System.out.println("Search - Title - " + toFind);
        int high = r.length; 
        int low = -1; 
        int probe; 
        while ( high - low > 1 ) 
        { 
            probe = ( high + low ) / 2;
            if ( r[probe].getTitle().compareTo(toFind) > 0) 
                high = probe; 
            else 
                low = probe; 
        } 
        if ( (low >= 0) && (r[low].getTitle().compareTo(toFind) == 0 )) 
            System.out.println("Found: " + r[low]); 
        else 
            System.out.println("Not found."); 
    }
    
    public static void searchYear(Music2[] myMusic, int searchYear)
    {
        System.out.println("Search - Year - " + searchYear);
        int found = 0;
        for (Music2 m : myMusic)
        {
            if (m.getYear() == searchYear)
            {
                found++;
                System.out.println("Found: " + m);
            }
        }
        if (found == 0)
            System.out.println("Not found.");
    }
    
    public static void searchSinger(Music2[] myMusic, String searchSinger)
    {
        System.out.println("Search - Singer - " + searchSinger);
        int found = 0;
        for (Music2 m : myMusic)
        {
            if (m.getSinger().equals(searchSinger))
            {
                found++;
                System.out.println("Found: " + m);
            }
        }
        if (found == 0)
            System.out.println("Not found.");
    }
}