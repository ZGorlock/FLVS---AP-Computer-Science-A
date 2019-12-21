/**
 * Creates objects of the Item class
 * 
 * @author Zachary Gill
 * @version 04-17-2013
 */
public class Item
{
    private String itemID;
    private String itemName;
    private int inStore;
    private double Price;
    
    /**
     * Constructor for objects of class Item
     */
    public Item(String itemID, String itemName, int inStore, double Price)
    {
        this.itemID = itemID;
        this.itemName = itemName;
        this.inStore = inStore;
        this.Price = Price;
    }
    
    /**
     * Returns inStore
     * 
     * @return inStore
     */
    public int getInStore()
    {
        return inStore;
    }

    /**
     * Returns the itemID
     * 
     * @return itemID
     */
    public String getItemID()
    {
        return itemID;
    }
    
    /**
     * Returns the itemName
     * 
     * @return itemName
     */
    public String getItemName()
    {
        return itemName;
    }
    
    /**
     * Returns the Price
     * 
     * @return Price
     */
    public double getPrice()
    {
        return Price;
    }
}
