import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReader
{
   public static void main(String[] args) throws IOException
   {
      String token = "";
      int tokeni = 0;
      double tokend = 0.0;
      //File fileName = new File("data3.txt");
      //Scanner inFile = new Scanner(fileName);
      int x = 3;
      while (x < 5)
      {
        File fileName = new File("data" + x + ".txt");
        Scanner inFile = new Scanner(fileName);
        while (inFile.hasNext())
        {
            tokend = inFile.nextDouble();
            System.out.println (tokend);
        }
        x += 1;        
        inFile.close();
      }
    }//end of main method
}//end of class 