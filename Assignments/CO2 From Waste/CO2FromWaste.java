/**
 * Calculates pounds of CO2 from waste for a family.
 * 
 * @author Zachary Gill
 * @version 01-24-2013
 */

public class CO2FromWaste
{
    //private instance variables
    private boolean myCans = false;
    private boolean myGlass = false;
    private boolean myPaper = false;
    private boolean myPlastic = false;
    private int myNumPeople = 0;
    private double myGross = 0.0;
    private double myReduction = 0.0;
    private double myNet = 0.0;
    
    /**
     * Default constructor for objects of type CO2FromWaste
     */
    public CO2FromWaste()
    {
    }  
    
    /**
     * A constructor method that initiates instance variables for the CO2FromWaste object.
     * 
     * @param numPeople number of people in the family.
     * @param paper whether the family recycles paper or not.
     * @param plastic whether the family recycles plastic or not.
     * @param glass whether the family recycles glass or not.
     * @param cans whether the family recycles cans or not.
     */
    public CO2FromWaste(int numPeople, boolean paper, boolean plastic, boolean glass, boolean cans)
    {
        myNumPeople = numPeople;
        myPaper = paper;
        myPlastic = plastic;
        myGlass = glass;
        myCans = cans;
        myGross = 0.0;
        myReduction = 0.0;
        myNet = 0.0;
    }
    
    /**
     * A mutator method that calculates the gross waste emission.
     */
    public void calcGrossWasteEmission()
    {
        myGross = (184 + 25.6 + 46.6 + 165.8) * myNumPeople;
    }
    
    /**
     * A mutator method that calculates the net waste reduction.
     */
    public void calcNetEmission()
    {
        myNet = myGross - myReduction;
    }
    
    /**
     * A mutator method that calculates the waste reduction.
     */
    public void calcWasteReduction()
    {
        if (myPaper == true)
            myReduction = myReduction + 184;
        if (myPlastic == true)
            myReduction = myReduction + 25.6;
        if (myGlass == true)
            myReduction = myReduction + 46.6;
        if (myCans == true)
            myReduction = myReduction + 165.8;
        myReduction = myReduction * myNumPeople;
    }
    
    /**
     * A getter method that returns whether the family recycles cans or not.
     * 
     * return Whether the family recycles cans or not.
     */
    public boolean getCans()
    {
        return myCans;
    }
    
    /**
     * A getter method that returns whether the family recycles glass or not.
     * 
     * return Whether the family recycles glass or not.
     */
    public boolean getGlass()
    {
        return myGlass;
    }
    
    /**
     * A getter method that returns whether the family recycles paper or not.
     * 
     * return Whether the family recycles paper or not.
     */
    public boolean getPaper()
    {
        return myPaper;
    }
    
    /**
     * A getter method that returns whether the family recycles plastic or not.
     * 
     * return Whether the family recycles plastic or not.
     */
    public boolean getPlastic()
    {
        return myPlastic;
    }
    
    /**
     * A getter method that returns the number of people.
     * 
     * return The number of people.
     */
    public int getPeople()
    {
        return myNumPeople;
    }
    
    /**
     * A getter method that returns the gross waste emission.
     * 
     * @return The gross waste emission.
     */
    public double getGross()
    {
        return myGross;
    }
    
    /**
     * A getter method that returns the net waste emission.
     * 
     * @return The net waste emission.
     */
    public double getNet()
    {
        return myNet;
    }
    
    /**
     * A getter method that returns the waste reduction.
     * 
     * return The waste reduction.
     */
    public double getReduction()
    {
        return myReduction;
    }
    
}