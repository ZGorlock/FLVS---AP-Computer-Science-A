
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * �FLVS 2007
 * @author Bill Jordan
 * @version 01/19/07
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
        
        double iNum1 = 
        
        // Addition
        System.out.println("Addition");
        System.out.print(iNum1 + " + " + iNum2 + " = ");
        System.out.println((iNum1 + iNum2));
        System.out.println("23.51 + 8.9325 = " + (23.51 + 8.9325));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.print(iNum3 + " - " + iNum4 + " = ");
        System.out.println((iNum3 - iNum4));
        System.out.println("98.6 - 47.0038 = " + (98.6 - 47.0038));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.print(iNum5 + " * " + iNum6 + " * " + iNum7 + " = ");
        System.out.println(( iNum5 * iNum6 * iNum7));
        System.out.println("3.14 * 5.0 + 5.0 = " + (3.14 * 5.0 * 5.0));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.print(iNum8 + " / " + iNum2 + " = ");
        System.out.println((iNum8 / iNum2));
        System.out.println("212.0 / 32.0 = " + (212.0 / 32.0));
        System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.print(iNum9 + " % " + iNum5 + " = ");
        System.out.println((iNum9 % iNum5));
        System.out.println("3298.7 % 243.1 = " + (3298.7 % 243.1));
        System.out.println();
        
        //Word Problems
        System.out.println("Word Problems");
        System.out.print(iNum5 + " / 2.5 * " + iNum10 + " + " + iNum11 + " / " + iNum12 + " = ");
        System.out.println((iNum5 / 2.5 * iNum10 + iNum11 / iNum12));
        System.out.print(iNum13 + " - (" + iNum13 + " / " + iNum14 + " % " + iNum15 + ") + " + iNum6 + " = ");
        System.out.println((iNum13 - (iNum13 / iNum14 % iNum15) + iNum6));
        System.out.print("(46.2 / " + iNum16 + ") - " + iNum6 + " + " + iNum17 + " % (" + iNum18 + " - " + iNum19 + " * " + iNum6 + ") = ");
        System.out.println(((46.2 / iNum16) - iNum6 + iNum17 % (iNum18 - iNum19 * iNum6)));
        System.out.print(iNum20 + " / " + iNum11 + " / " + iNum15 + " + " + iNum21 + " * .5 - " + iNum22 + " % " + iNum2 + ") = ");
        System.out.println((iNum20 / iNum11 / iNum15 + iNum21 * .5 - iNum22 % iNum2));
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
