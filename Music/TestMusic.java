/**
 * Searches through a list of Music objects.
 * 
 * @author Zachary Gill
 * @version 04-25-2013
 */
public class TestMusic
{
    /**
     * Main method of TestMusic
     */
    public static void main(String [] args)
    {
        Music[] myMusic = new Music[10];
        myMusic[0] = new Music("Pieces of You", 1994, "Jewel");
        myMusic[1] = new Music("Jagged Little Pill", 1995, "Alanis Morissette");
        myMusic[2] = new Music("What Is It's You", 1995, "Reba McEntire");
        myMusic[3] = new Music("Misunderstood", 2001, "Pink");
        myMusic[4] = new Music("Laundry Service", 2001, "Shakira");
        myMusic[5] = new Music("Taking the Long Way", 2006, "Dixie Chicks");
        myMusic[6] = new Music("Under My Skin", 2004, "Avril Lavigne");
        myMusic[7] = new Music("Let Go", 2002, "Avril Lavigne");
        myMusic[8] = new Music("Let It Go", 2007, "Tim McGraw");
        myMusic[9] = new Music("White Flag", 2004, "Dido");
        
        printMusic(myMusic);
        System.out.println();
        searchTitle(myMusic, "Let Go");
        System.out.println();
        searchTitle(myMusic, "Some Day");
        System.out.println();
        searchYear(myMusic, 2001);
        System.out.println();
        searchYear(myMusic, 2003);
        System.out.println();
        searchSinger(myMusic, "Avril Lavigne");
        System.out.println();
        searchSinger(myMusic, "Tony Curtis");
    }
    
    public static void printMusic(Music[] myMusic)
    {
        System.out.println("Music library:");
        System.out.println("--------------");
        for (Music m : myMusic)
            System.out.println(m);
    }
    
    public static void searchTitle(Music[] myMusic, String searchTitle)
    {
        System.out.println("Search - Title - " + searchTitle);
        int found = 0;
        for (Music m : myMusic)
        {
            if (m.getTitle().equals(searchTitle))
            {
                found++;
                System.out.println("We found " + searchTitle + " in the library:");
                System.out.println(m);
                break;
            }
        }
        if (found == 0)
            System.out.println(searchTitle + " is not in the library");
    }
    
    public static void searchYear(Music[] myMusic, int searchYear)
    {
        System.out.println("Search - Year - " + searchYear);
        System.out.println("Find results:");
        int found = 0;
        for (Music m : myMusic)
        {
            if (m.getYear() == searchYear)
            {
                found++;
                System.out.println(m);
            }
        }
        if (found == 0)
            System.out.println("There are no listings for " + searchYear);
        else
            System.out.println("There were " + found + " listings for " + searchYear);
    }
    
    public static void searchSinger(Music[] myMusic, String searchSinger)
    {
        System.out.println("Search - Singer - " + searchSinger);
        System.out.println("Find results:");
        int found = 0;
        for (Music m : myMusic)
        {
            if (m.getSinger().equals(searchSinger))
            {
                found++;
                System.out.println(m);
            }
        }
        if (found == 0)
            System.out.println("There are no listings for " + searchSinger);
        else
            System.out.println("There were " + found + " listings for " + searchSinger);
    }
}
