/**
 * Calculates your fine on a media center book.
 * 
 * Zachary Gill
 * 11-06-2012
 */
import java.util.Scanner;

public class Fines
{
    public static void main(String[] args)
    {
        //define objects
        Scanner in = new Scanner(System.in);
        
        //set variables
        double fine = .12;
        
        //collect information
        System.out.println("Please enter your name (Last, First) and Social Security Number (###-##-####): ");
        String lastName = in.next();
        String otherpart = in.nextLine();
        String temppart = otherpart.substring(otherpart.indexOf(' ') + 1);
        String firstName = temppart.substring(0, temppart.indexOf(' '));
        String ssn = temppart.substring(temppart.indexOf(' ') + 1);
	    System.out.println();
                        
	    System.out.println("Enter the title of the book: ");
	    String book = in.nextLine();
	    System.out.println();

	    System.out.println("Enter the date checked out (mm/dd/yyyy): ");
	    String date1 = in.nextLine();
	    System.out.println();
	    
	    System.out.println("Enter today's date (mm/dd/yyyy): ");
	    String date2 = in.nextLine();
	    System.out.println();
	    
	    //find time difference
	    int month1 = Integer.parseInt(date1.substring(0, 2));
	    int month2 = Integer.parseInt(date2.substring(0, 2));
	    int day1 = Integer.parseInt(date1.substring(3, 5));
	    int day2 = Integer.parseInt(date2.substring(3, 5));
	    int year1 = Integer.parseInt(date1.substring(6));
	    int year2 = Integer.parseInt(date2.substring(6));
	    
	    int monthdif = month2 - month1;
	    int daydif = day2 - day1;
	    int yeardif = year2 - year1;
	    
	    int days = (yeardif * 365) + (monthdif * 30) + daydif;
	    
	    //checks to see if book is really "late" (one week to read the book)
	    days = days - 7;
	    if (days < 0) {days = 0;}
	    
	    //calculate fine
	    double totalFine = (double) days * fine;
	    
	    //print output
	    System.out.println("Days late: " + days);
	    System.out.println("Daily fine: " + fine);
	    System.out.println();
	    System.out.println();
	    System.out.print("To: " + lastName);
	    System.out.print(", " + firstName);
	    System.out.print("          ");
	    System.out.println("Account: " + (lastName + firstName).substring(0, 8) + "-" + ssn.substring(7));
	    System.out.println("From: Zack");
	    System.out.println("Subject: Overdue Notice");
	    System.out.println("================================================================");
	    System.out.println(book + " was checked out on: " + date1);
	    System.out.println("The book is currently " + days + " days late.");
	    System.out.println("Your fine has accumulated to: $" + totalFine);
    }
}