/**
 * A candy machine.
 * 
 * @author Zachary Gill
 * @version 4-27-2013
 */
public class CandyMachine
{
    /**
     * Main method for CandyMachine
     */
    public static void main(String [] args)
    {
        Dispenser chocolate = new Dispenser(100, 2);
        CashRegister register = new CashRegister(40);
        
        //sellProduct(chocolate, register, 101);
        sellProduct(chocolate, register, 2);
    }
    
    public static void sellProduct(Dispenser d, CashRegister c, int a)
    {
        if (a > d.getCount())
            throw new IllegalArgumentException("Not enough items in stock");
        else
        {
            for (int k = 1; k <= a; k++)
            {
                c.acceptAmount(d.getProductCost());
                d.makeSale();
                System.out.println("Collect your item at the bottom and enjoy");
            }
        }
    }
}
