import java.util.ArrayList;
import java.util.Collections;

/**
 * Calculates total CO2 footprint for a family.
 * 
 * @author Zachary Gill
 * @version 01-24-2013
 */

public class CO2Footprint
{
    //private instance variables
    private double myGallonsUsed = 0.0;
    
    private ArrayList<Double> myBill = new ArrayList<Double>();
    private ArrayList<Double> myPrice = new ArrayList<Double>();
    
    private int myNumPeople = 0;
    
    private boolean myCans = false;
    private boolean myGlass = false;
    private boolean myPaper = false;
    private boolean myPlastic = false;
    
    private int myBulbs = 0;
    
    private double myWasteCO2 = 0.0;
    private double myElectricityCO2 = 0.0;
    private double myGasCO2 = 0.0;
    
    private double myBulbReduction = 0.0;
    private double myWasteReduction = 0.0;
    
    private double myAvgBill = 0.0;
    private double myAvgPrice = 0.0;  
    
    private double myGross = 0.0;
    private double myReduction = 0.0;
    private double myNet = 0.0;
    
    /**
     * Default constructor for objects of type CO2FromWaste
     */
    public CO2Footprint()
    {
    }
    
    /**
     * A constructor method that initiates instance variables for the CO2FromWaste object.
     * 
     * @param gals number of gallons of gas used.
     * @param monthlyBill array of cost of electricity.
     * @param monthlyPrice array of cost of kwh.
     * @param numPeople number of people in the family.
     * @param wastes array of booleans for whether you recycle certain items or not.
     * @param bulbs number of bulbs replaced.
     */
    public CO2Footprint(double gals, ArrayList<Double> monthlyBill, ArrayList<Double> monthlyPrice, int numPeople, boolean [] wastes, int bulbs)
    {
        myGallonsUsed = gals;
        myBill = monthlyBill;
        myPrice = monthlyPrice;
        myNumPeople = numPeople;
        
        myPaper = wastes[0];
        myPlastic = wastes[1];
        myGlass = wastes[2];
        myCans = wastes[3];
        
        myBulbs = bulbs;
        
        myWasteCO2 = 0.0;
        myElectricityCO2 = 0.0;
        myGasCO2 = 0.0;
        
        myBulbReduction = 0.0;
        myWasteReduction = 0.0;
        
        myAvgBill = 0.0;
        myAvgPrice = 0.0;
        
        myGross = 0.0;
        myReduction = 0.0;
        myNet = 0.0;
    }
    
    /**
     * A mutator method that calculates the average annual electricity bill.
     */
    public void calcAverageBill()
    {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i < myBill.size(); i++)
            sum = sum + myBill.get(i);
        myAvgBill = sum / myBill.size();
    }
    
    /**
     * A mutator method that calculates the average annual price of electricity.
     */
    public void calcAveragePrice()
    {
        double sum = 0.0;
        for (int i = 0; i < myPrice.size(); i++)
            sum = sum + myPrice.get(i);
        myAvgPrice = sum / myPrice.size();
    }
    
    public void calcBulbReduction()
    {
        myBulbReduction = myBulbs * 1.37 * 73;
    }
    
    /**
     * A mutator method that calculates the annual home CO2 emission from electricity.
     */
    public void calcElectricityCO2()
    {
        myElectricityCO2 = ((myAvgBill / myAvgPrice) * 1.37 * 12);
    }
    
    /**
     * A mutator method that calculates the gross CO2 footprint.
     */
    public void calcGross()
    {
        myGross = myGasCO2 + myElectricityCO2 + myWasteCO2;
    }
    
    /**
     * Calculates tons of CO2 emitted from gallons of fuel used
     */
    public void calcGasCO2()
    {
        myGasCO2 = ((myGallonsUsed * (8.78 * Math.pow(10, -3))) / 0.00045359237);
    }
    
    /**
     * A mutator method that calculates the net waste reduction.
     */
    public void calcNet()
    {
        myNet = myGross - myReduction;
    }
    
    public void calcReduction()
    {
        myReduction = myWasteReduction + myBulbReduction;
    }
    
    /**
     * A mutator method that calculates the gross waste emission.
     */
    public void calcWasteCO2()
    {
        myWasteCO2 = (184 + 25.6 + 46.6 + 165.8) * myNumPeople;
    }
    
    /**
     * A mutator method that calculates the waste reduction.
     */
    public void calcWasteReduction()
    {
        if (myPaper == true)
            myWasteReduction = myWasteReduction + 184;
        if (myPlastic == true)
            myWasteReduction = myWasteReduction + 25.6;
        if (myGlass == true)
            myWasteReduction = myWasteReduction + 46.6;
        if (myCans == true)
            myWasteReduction = myWasteReduction + 165.8;
        myWasteReduction = myWasteReduction * myNumPeople;
    }
    
    /**
     * A getter method that returns the bulb reduction.
     * 
     * return The bulb reduction.
     */
    public double getBulbReduction()
    {
        return myBulbReduction;
    }
    
    /**
     * A getter method that returns the CO2 from electricity.
     * 
     * @return The CO2 from electricity.
     */
    public double getElectricityCO2()
    {
        return myElectricityCO2;
    }
    
    /**
     * A getter method that returns the CO2 from gas.
     * 
     * @return The CO2 from gas.
     */
    public double getGasCO2()
    {
        return myGasCO2;
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
     * A getter method that returns CO2 from waste.
     * 
     * return The CO2 from waste.
     */
    public double getWasteCO2()
    {
        return myWasteCO2;
    }
    
    /**
     * A getter method that returns the waste reduction.
     * 
     * return The waste reduction.
     */
    public double getWasteReduction()
    {
        return myWasteReduction;
    }
}