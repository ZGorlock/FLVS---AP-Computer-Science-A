
/**
 * Shows the use of integer and double variable types and working and printing mathematical expression.
 * 
 * Zachary Gill
 * 10-18-2012
 */
public class CalculationsV5
{
    public static void main(String[ ] args)
    {
        //Vairable Definition
        int iNum1 = 4;
        int iNum2 = 8;
        int iNum3 = 9;
        int iNum4 = 33;
        int iNum5 = 15;
        int iNum6 = 3;
        int iNum7 = 201;
        int iNum8 = 96;
        int iNum9 = 23;
        int iNum10 = -2;
        int iNum11 = 10;
        int iNum12 = 5;
        int iNum13 = 234;
        int iNum14 = 6;
        int iNum15 = 12;
        int iNum16 = 11;
        int iNum17 = 24;
        int iNum18 = 17;
        int iNum19 = 2;
        int iNum20 = 480;
        int iNum21 = 200;
        int iNum22 = 20;        
        int iNum23 = 81;
        int iNum24 = 47;
        int iNum25 = 621;
        int iNum26 = 54;
        int iNum27 = 99;
        int iNum28 = 78;
        int iNum29 = 79;
        double dNum1 = 23.51;
        double dNum2 = 8.9325;
        double dNum3 = 98.6;
        double dNum4 = 47.0038;
        double dNum5 = 3.14;
        double dNum6 = 5.0;
        double dNum7 = 212.0;
        double dNum8 = 32.0;
        double dNum9 = 3298.7;
        double dNum10 = 243.1;
        double dNum11 = 2.5;
        double dNum12 = 46.2;
        double dNum13 = .5;
        
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " + " + iNum2 + " = ");
        System.out.println((iNum1 + iNum2));
        System.out.print(dNum1 + " + " + dNum2 + " = ");
        System.out.println((dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " - " + iNum4 + " = ");
        System.out.println((iNum3 - iNum4));
        System.out.print(dNum3 + " - " + dNum4 + " = ");
        System.out.println((dNum3 - dNum4));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum5 + " * " + iNum6 + " * " + iNum7 + " = ");
        System.out.println(( iNum5 * iNum6 * iNum7));
        System.out.print(dNum5 + " * " + dNum6 + " * " + dNum6 + " = ");
        System.out.println((dNum5 * dNum6 * dNum6));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum8 + " / " + iNum2 + " = ");
        System.out.println((iNum8 / iNum2));
        System.out.print(dNum7 + " / " + dNum8 + " = ");
        System.out.println((dNum7 / dNum8));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum9 + " % " + iNum5 + " = ");
        System.out.println((iNum9 % iNum5));
        System.out.print(dNum9 + " % " + dNum10 + " = ");
        System.out.println((dNum9 % dNum10));
        System.out.println();
        
        //Word Problems
        System.out.println("Word Problems");
        System.out.print(iNum5 + " / " + dNum11 + " * " + iNum10 + " + " + iNum11 + " / " + iNum12 + " = ");
        System.out.println((iNum5 / dNum11 * iNum10 + iNum11 / iNum12));
        System.out.print(iNum13 + " - (" + iNum13 + " / " + iNum14 + " % " + iNum15 + ") + " + iNum6 + " = ");
        System.out.println((iNum13 - (iNum13 / iNum14 % iNum15) + iNum6));
        System.out.print("(" + dNum12 + " / " + iNum16 + ") - " + iNum6 + " + " + iNum17 + " % (" + iNum18 + " - " + iNum19 + " * " + iNum6 + ") = ");
        System.out.println(((dNum12 / iNum16) - iNum6 + iNum17 % (iNum18 - iNum19 * iNum6)));
        System.out.print(iNum20 + " / " + iNum11 + " / " + iNum15 + " + " + iNum21 + " * " + dNum13 + " - " + iNum22 + " % " + iNum2 + ") = ");
        System.out.println((iNum20 / iNum11 / iNum15 + iNum21 * dNum13 - iNum22 % iNum2));
        System.out.println();
        
        //Custom Expressions
        System.out.println("Custom Expressions");
        System.out.print(iNum23 + " + " + iNum24 + " - " + iNum25 + " = ");
        System.out.println((iNum23 + iNum24 - iNum25));
        System.out.print(iNum26 + " * " + iNum27 + " / " + iNum28 + " % " + iNum29 + " = ");
        System.out.println((iNum26 * iNum27 / iNum28 % iNum29));
        System.out.println();
               
    } // end of main method
} // end of class
