
/**
 * Codes a text message.
 * 
 * Zachary Gill
 * 11-05-2012
 */
import java.util.Scanner;
public class TextMessageCoderV2
{
    public static void main(String [] args)
    {
        //construct a Scanner object with two lines
        Scanner in;
        in = new Scanner(System.in);
        
        
        //define variables
        //String message = "hello, i am going to be right back because i have got to go get something";
        
	    System.out.println("Please enter a message:  ");
	    String message = in.nextLine();
        
        
        String newmessage = message;
        
        //preform coding
        newmessage = newmessage.replaceAll("hello", "hey");
        newmessage = newmessage.replaceAll("be right back", "brb");
        newmessage = newmessage.replaceAll("got to go", "gtg");
        newmessage = newmessage.replaceAll("because", "cuz");
        newmessage = newmessage.replaceAll("i am", "im");
        newmessage = newmessage.replaceAll("going to", "gonna");
        
        //print output
        System.out.println("Original Message:");
        System.out.println(message);
        System.out.println("message length: " + message.length());
        System.out.println();
        System.out.println("New Message:");
        System.out.println(newmessage);
        System.out.println("message length: " + newmessage.length());
    }    
}
