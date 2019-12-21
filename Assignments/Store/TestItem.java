/**
 * Sorts items in a store based on properties
 * 
 * @author Zachary Gill
 * @version 04-17-2013
 */
public class TestItem
{
    /**
     * main method for class TestItem
     */
    public static void main(String [] args)
    {
        String[] itemID = {"1011", "1034", "1101", "1600", "1500", "1201"};
        String[] itemName = {"Air Filters", "Door Knobs", "Hammers", "Levels", "Ceiling Fans", "Wrench Sets"};
        int[] inStore = {200, 60, 90, 80, 100, 55};
        double[] Price = {10.5, 21.5, 9.99, 19.99, 59.0, 80.0};
        Item[] item = new Item[6];
        
        for (int k = 0; k < itemID.length; k++)
            item[k] = new Item(itemID[k], itemName[k], inStore[k], Price[k]);
        
        System.out.println("Original Array:");
        System.out.println();
        printItems(item);
        System.out.println();
        System.out.println("Sorted by ID:");
        System.out.println();
        printItems(sortItemID(item, 0, item.length-1));
        System.out.println();
        System.out.println("Sorted by Name:");
        System.out.println();
        printItems(sortItemName(item));
        System.out.println();
        System.out.println("Sorted by inStore:");
        System.out.println();
        printItems(sortInStore(item));
        System.out.println();
        System.out.println("Sorted by Price:");
        System.out.println();
        printItems(sortPrice(item, 0, item.length-1));
        System.out.println();
        
    }
    
    /**
     * Prints the item array
     */
    public static void printItems(Item[] item)
    {
        System.out.printf("%-12s%-15s%-8s%8s%n", "itemID", "itemName", "inStore", "price");
        System.out.println("-------------------------------------------");
        for (Item i : item)
            System.out.printf("%-12s%-12s%8d%4s%6.2f%n", i.getItemID(), i.getItemName(), i.getInStore(), "$", i.getPrice());
    }
    
    public static Item[] sortItemID(Item[] a, int low, int high)
    {
        if ( low == high )
            return a;

        int mid = ( low + high ) / 2;

        sortItemID( a, low, mid ); 
        sortItemID( a, mid + 1, high); 

        mergeItemID( a, low, mid, high);
        
        return a;
    }  
    
    public static void mergeItemID( Item[] a, int low, int mid, int high )
    {
        Item[] temp = new Item[ high - low + 1 ];

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
            else if ( a[ i ].getItemID().compareTo(a[ j ].getItemID()) < 0  )
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
    
    public static Item[] sortItemName(Item[] item)
    {
        Item[] titleSort = new Item[item.length];
        for (int i = 0 ; i < item.length ; i++)
        {
            Item next = item[i];
            int insertindex = 0;
            int k = i;
            while (k > 0 && insertindex == 0)
            {
                if (next.getItemName().compareTo(titleSort[k - 1].getItemName()) < 0)
                    insertindex = k;
                else
                    titleSort[k] = titleSort[k - 1];
                k--;
            }
            titleSort[insertindex] = next;
       }
       return titleSort;
    }
    
    public static Item[] sortInStore(Item[] item)
    {
        int i;
        int k;
        int posmax;
        Item temp;
        for ( i = item.length - 1 ; i >= 0 ; i-- )
        {
             posmax = 0;
             for ( k = 0 ; k <= i ; k++ )
             {
                if ( item[ k ].getInStore() > item[ posmax ].getInStore() )
                    posmax = k;
             }
             temp = item[ i ];
             item[ i ] = item[ posmax ];
             item[ posmax ] = temp;
        }
        return item;
    }
    
        public static Item[] sortPrice(Item[] a, int low, int high)
    {
        if ( low == high )
            return a;

        int mid = ( low + high ) / 2;

        sortPrice( a, low, mid ); 
        sortPrice( a, mid + 1, high); 

        mergePrice( a, low, mid, high);
        
        return a;
    }  
    
    public static void mergePrice( Item[] a, int low, int mid, int high )
    {
        Item[] temp = new Item[ high - low + 1 ];

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
            else if ( a[ i ].getPrice() > a[ j ].getPrice()  )
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
