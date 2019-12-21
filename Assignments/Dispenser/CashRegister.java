/**
 * Write a description of class CashRegister here.
 * 
 * @author Zachary Gill
 * @version 04-27-2013
 */
public class CashRegister
{
    private int cashOnHand;

    /**
     * Default constructor for objects of class CashRegister
     */
    public CashRegister()
    {
        cashOnHand = 500;
    }
    
    /**
     * Constructor for objects of class CashRegister
     */
    public CashRegister(int coh)
    {
        if (coh <= 0)
            throw new IllegalArgumentException("cashOnHand must be > 0");
        else
            cashOnHand = coh;
    }
    
    public void acceptAmount(int a)
    {
        if (a <= 0)
            throw new IllegalArgumentException("amount must be greater than 0");
        else
            cashOnHand = cashOnHand + a;
    }
}
