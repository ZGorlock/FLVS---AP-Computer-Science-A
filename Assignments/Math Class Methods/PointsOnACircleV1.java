/**
 * Displays points on a circle of radius x.
 * 
 * Zachary Gill
 * 01-08-2013
 */

public class PointsOnACircleV1
{
    public static void main(String[] args)
    {
        //variables
        double point = 0.0;
        double radius = 1.0;
        double step = .1;
        
        //output/math
        System.out.printf("%3s%s%.2f%n", "", "Points on a Circle of Radius ", radius);
        System.out.printf("%5s%8s%15s%8s%n", "x1", "y1", "x1", "y2");
        System.out.println("---------------------------------------");
        for (double calc = radius; calc >= (-1 * radius); calc -= step)
        {
            point = Math.abs(Math.sqrt(((Math.pow(radius, 2)) - (Math.pow(calc, 2)))));
            System.out.printf("%6.2f%8.2f%15.2f%8.2f%n", calc, point, calc, (-1 * point));
        }
        System.out.println("---------------------------------------");
    }
}