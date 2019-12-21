
/**
 * Finds the average of 4 grades.
 * 
 * Zachary Gill
 * 10-22-2012
 */

public class GradesV2
{
    public static void main(String[ ] args)
    {
        //local variables
        int numTests = 0; //counts number of tests
        int testGrade = 0; //individual test grade
        int totalPoints = 0; //total points for all tests
        double average = 0.0; //average grade
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 97;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("   Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 79;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 83;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 88;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 50;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 100;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print(" Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 79;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
        
        numTests++;
        System.out.print("n = " + numTests);
        testGrade = 78;
        System.out.print("  New Test Grade: " + testGrade);
        totalPoints = totalPoints + testGrade;
        System.out.print("  Total Points: " + totalPoints);
        average = (double) totalPoints / (double) numTests;
        System.out.println("  Average Score: " + average);
    }//end of main method
}//end of class
