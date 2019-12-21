/**
 * Determines probabilities of the genders of 2 children based on a sample.
 * 
 * Zachary Gill
 * 11-30-2012
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Family
{
   public static void main(String[] args) throws IOException
   {
      int samples = 0;
      double bb = 0;
      double bg = 0;
      double gg = 0;
      String token = "";
      
      File fileName = new File("MaleFemaleInFamily.txt");     
      Scanner inFile = new Scanner(fileName);
      while (inFile.hasNext())
      {
          samples += 1;
          token = inFile.next();
          if (token.equals("BB"))
            bb += 1;
          else if (token.equals("BG"))
            bg += 1;
          else if (token.equals("GB"))
            bg += 1;
          else
            gg += 1;
      }
      inFile.close();
      System.out.println("Sample Size: " + samples);
      System.out.println("Two Boys: " + (int) ((bb / samples) * 100) + "%");
      System.out.println("One Boy One Girl: " + (int) ((bg /samples) * 100) + "%");
      System.out.println("Two Girls: " + (int) ((gg / samples) * 100) + "%");
    }//end of main method    
}
