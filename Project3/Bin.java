import java.util.*;

public class Bin
{
    private String myName;
    private ArrayList<BinItem> myContents;

    public Bin(String name)
    {
        myName = name;
        myContents = new ArrayList<BinItem>();
    }
    
    public ArrayList<BinItem> getContents()
    {
        return myContents;
    }

    public String getName()
    {
        return myName;
    }
    
    public String toString()
    {
        String s = "Bin " + myName + ":\n";
        for (BinItem b : myContents)
            s += b + "\n";
        return s;
    }
    
    public void add(BinItem b)
    {
        myContents.add(b);
    }
}