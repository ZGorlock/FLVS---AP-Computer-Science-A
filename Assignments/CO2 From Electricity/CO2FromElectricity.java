import java.util.ArrayList;
import java.util.Collections;

/**
 * Calculates pounds of CO2 emission from using Electricity.
 * 
 * @author Zachary Gill
 * @version 01-20-2013
 */

public class CO2FromElectricity
{
    /**
     * Default constructor for objects of type CO2FromElectricity
     */
    public CO2FromElectricity()
    {
    }
          
    /**
     * A mutator method that calculates the average annual electricity bill.
     * 
     * @param monthlyBill an Arraylist containing the monthly bills for home electricity use.
     * 
     * @return The average monthly electricity bill.
     */
    public double calcAverageBill(ArrayList<Double> monthlyBill)
    {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i < monthlyBill.size(); i++)
            sum = sum + monthlyBill.get(i);
        avg = sum / monthlyBill.size();
        return avg;
    }
    
    /**
     * A mutator method that calculates the average annual price of electricity.
     * 
     * @param monthlyPrice an Arraylist containing the monthly price of electricity per kilowatthour.
     * 
     * @return The average monthly price of electricity.
     */
    public double calcAveragePrice(ArrayList<Double> monthlyPrice)
    {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i < monthlyPrice.size(); i++)
            sum = sum + monthlyPrice.get(i);
        avg = sum / monthlyPrice.size();
        return avg;
    }
    
    /**
     * A mutator method that calculates the annual home CO2 emission from electricity.
     * 
     * @param avgBill The average monthly home electricity bill.
     * @param avgPrice The average monthly price of home electricity.
     * 
     * @return The annual home CO2 emission from home electricity use.
     */
    public double calcElectricityCO2(double avgBill, double avgPrice)
    {
        return ((avgBill / avgPrice) * 1.37 * 12);
    }
}