public class BinItem
{
    private String mySKU;
    private int myQuantity;
    
    public BinItem(String sku, int quantity)
    {
        mySKU = sku;
        myQuantity = quantity;
    }
    
    public String getSKU() 
    { 
        return mySKU;
    }
    
    public int getQuantity()
    {
        return myQuantity;
    }
    
    public String toString()
    {
        return "SKU " + mySKU + ": " + myQuantity;
    }
}