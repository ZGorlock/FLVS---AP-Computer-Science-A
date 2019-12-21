
/**
 * This class instantiates shapes objects with four private instance variables.
 * It contains two mutator methods to calculate the area of a triangle and the
 * hypoteneuse of a triangle.  There are getter methods for each private instance
 * variable.
 * 
 * @author B. Jordan 
 * @version 06/01/07
 */
//import java.util.ArrayList;
class ShapesV11
{
    //declaration of private instance variables
    private int side1, side2;
    private double area, hypoteneuse;
    
    
    //constructor for ojbects of type ShapesV8
    ShapesV11(int side1, int side2)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.area = 0.0;
        this.hypoteneuse = 0.0;
    }
    
    //mutator method to calculate the area of a triangle
    public double calcTriArea()
    {
        this.area = this.side1 * this.side2 * .5;
        return this.area;
    }
    
    //getter method to return the value of the area of a triangle
    public double getTriArea()
    {
        return this.area;
    }
    
    //mutator method to calculate the hypoteneuse of a triangle
    public void calcHypoteneuse()
    {
        this.hypoteneuse = Math.sqrt(Math.pow(this.side1, 2) + Math.pow(this.side2, 2));
    }
    
    //getter method to return the value of the hypoteneuse of a triangle
    public double getHypoteneuse()
    {
        return this.hypoteneuse;
    }
    
    //getter method to return the value of side 1 of a triangle
    public int getSide1()
    {
        return this.side1;
    }
    
    //getter method to return the value of side 2 of a triangle
    public int getSide2()
    {
        return this.side2;
    }
    
    
}    