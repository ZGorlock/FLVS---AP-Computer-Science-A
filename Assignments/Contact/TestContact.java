/**
 * Creates a contact database
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class TestContact
{
    /**
     * Main method for TestContact
     */
    public static void main(String [] args)
    {
        Contact[] myContacts = new Contact[6];
        myContacts[0] = new Contact("John Carter", "brother", "Mar 3", "(342) 555-7069", "jcarter@carter.com");
        myContacts[1] = new Contact("Elise Carter", "mom", "Apr 19", "(342) 555-7011", "carterMom@carter.com");
        myContacts[2] = new Contact("Ellie Carter", "me", "Jun 10", "(342) 555-8102", "ecarter@carter.com");
        myContacts[3] = new Contact("Sue Ellen", "friend", "Mar 9", "(341) 555-9182", "susieE@hotmail.com");
        myContacts[4] = new Contact("Frank Carter", "dad", "Dec 1", "(342) 555-7011", "carterDad@carter.com");
        myContacts[5] = new Contact("Johnnie", "friend", "Jan 21", "(341) 555-7789", "jDawg5555@yahoo.com");
        
        printContacts(myContacts);
        findByName(myContacts, "Johnnie");
        findByName(myContacts, "Sam Parker");
        findByRelation(myContacts, "friend");
        findByRelation(myContacts, "Aunt");
        findByPhone(myContacts, "(333) 555-8989");
        findByPhone(myContacts, "(342) 555-7011");
        findByBMonth(myContacts, "May");
        findByBMonth(myContacts, "Mar");
        findByEmail(myContacts, "rgoodman@hotmail.com");
        findByEmail(myContacts, "susieE@hotmail.com");
    }
    
    public static void printContacts(Contact[] myContacts)
    {
        System.out.printf("%34s%s%n", "", "Contact List");
        System.out.println();
        System.out.printf("%-18s%-18s%-18s%-18s%-18s%n", "Name", "Relation", "Birthday", "Phone", "Email");
        System.out.println("--------------------------------------------------------------------------------------------");
        for (Contact c : myContacts)
            System.out.println(c);
    }
    
   public static Contact[] Sort (Contact[] a, int low, int high, int type)
    {
        if (low == high)
            return a;
        int mid = (low + high) / 2;
        Sort(a, low, mid, type);
        Sort(a, mid + 1, high, type);
        Merge(a, low, mid, high, type);
        return a;
    }  
    
    public static void Merge(Contact[] a, int low, int mid, int high, int type)
    {
        Contact[] temp = new Contact[high - low + 1];
        int i = low, j = mid + 1, n = 0;
        while (i <= mid || j <= high)
        {
            if (i > mid)
            {
                temp[n] = a[j];
                j++;
            }
            else if (j > high)
            {
                temp[n] = a[i];
                i++;
            }
            else if (type == 0 && a[i].getName().compareTo(a[j].getName()) < 0)
            {
                temp[n] = a[i];
                i++;
            }
            else if (type == 1 && a[i].getEmail().compareTo(a[j].getEmail()) < 0)
            {
                temp[n] = a[i];
                i++;
            }
            else
            {
                temp[n] = a[j];
                j++;
            }
            n++;
        }
        for (int k = low ; k <= high ; k++)
            a[k] = temp[k - low];
    }
    
    public static void findByName(Contact[] r, String toFind)
    {
        System.out.println();
        System.out.println("Find Name - " + toFind);
        r = Sort(r, 0, r.length - 1, 0);
        int high = r.length; 
        int low = -1; 
        int probe; 
        while ( high - low > 1 ) 
        { 
            probe = ( high + low ) / 2;
            if ( r[probe].getName().compareTo(toFind) > 0) 
                high = probe; 
            else 
                low = probe; 
        } 
        if ( (low >= 0) && (r[low].getName().compareTo(toFind) == 0 )) 
            System.out.println(r[low]); 
        else 
            System.out.println("Not found."); 
    }
    
    public static void findByRelation(Contact[] myContact, String toFind)
    {
        System.out.println();
        System.out.println("Find Relation - " + toFind);
        int found = 0;
        for (Contact m : myContact)
        {
            if (m.getRelation().equals(toFind))
            {
                found++;
                System.out.println(m);
            }
        }
        if (found == 0)
            System.out.println("Not found.");
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }
    
    public static void findByBMonth(Contact[] myContact, String toFind)
    {
        System.out.println();
        System.out.println("Find BDay - " + toFind);
        int found = 0;
        for (Contact m : myContact)
        {
            if ((m.getBday().substring(0, 3)).equals(toFind))
            {
                found++;
                System.out.println(m);
            }
        }
        if (found == 0)
            System.out.println("Not found.");
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }
    
    public static void findByPhone(Contact[] myContact, String toFind)
    {
        System.out.println();
        System.out.println("Find Phone - " + toFind);
        int found = 0;
        for (Contact m : myContact)
        {
            if (m.getPhone().equals(toFind))
            {
                found++;
                System.out.println(m);
            }
        }
        if (found == 0)
            System.out.println("Not found.");
        else
            System.out.println("There were " + found + " listings for " + toFind);
    }
    
    public static void findByEmail(Contact[] r, String toFind)
    {
        System.out.println();
        System.out.println("Find Email - " + toFind);
        r = Sort(r, 0, r.length - 1, 1);
        int high = r.length; 
        int low = -1; 
        int probe; 
        while ( high - low > 1 ) 
        { 
            probe = ( high + low ) / 2;
            if ( r[probe].getEmail().compareTo(toFind) > 0) 
                high = probe; 
            else 
                low = probe; 
        } 
        if ( (low >= 0) && (r[low].getEmail().compareTo(toFind) == 0 )) 
            System.out.println(r[low]); 
        else 
            System.out.println("Not found."); 
    }
}
