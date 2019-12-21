/**
 * test program for triamgle
 * 
 * @author Zachary Gill
 * @version 02-25-2013
 */
public class TestTriangle
{
	public static void main (String []args)
	{
	    Triangle one = new Triangle(3, 4, 5);
	    EquilateralTriangle two = new EquilateralTriangle(6);
	    IsoscelesTriangle three = new IsoscelesTriangle(7, 9);
	    
	    System.out.println("Triangle has sides A = " + one.getSideA() + ", B = " + one.getSideB() + ", C = " + one.getSideC());
	    System.out.println("Equilateral Triangle has sides A = " + two.getSideA() + ", B = " + two.getSideB() + ", C = " + two.getSideC());
	    System.out.println("Isosceles Right Triangle has sides A = " + three.getSideA() + ", B = " + three.getSideB() + ", C = " + three.getSideC());
	}
	
}
