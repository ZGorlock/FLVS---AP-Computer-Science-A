import java.util.List;
import java.util.ArrayList;

/**
 * Keeps an inventory of Products
 * 
 * @author Zachary Gill
 * @version 04-19-2013
 */
public class InventoryDemo
{
    /**
     * Main method of InventoryDemo
     */
    public static void main()
    {
        List<Product> inventory = new ArrayList<Product>();
        inventory.add(new Car("Jaguar", 100000.00));
        inventory.add(new Car("Neon", 17000.00));
        inventory.add(new Tool("JigSaw", 149.18));
        inventory.add(new Car("Jaguar", 110000.00));
        inventory.add(new Car("Neon", 17500.00));
        inventory.add(new Car("Neon", 17875.32));
        inventory.add(new Truck("RAM", 35700.00));
        inventory.add(new Tool("CircularSaw", 200.00));
        inventory.add(new Tool("CircularSaw", 150.00));
        
        takeInventory("JigSaw", inventory);
        takeInventory("Neon", inventory);
        takeInventory("Jaguar", inventory);
        takeInventory("RAM", inventory);
        takeInventory("CircularSaw", inventory);
        
        compare((Tool) inventory.get(7), (Tool) inventory.get(8));
    }
    
    public static void takeInventory(String name, List<Product> inventory)
    {
        int quantity = 0;
        double totalCost = 0.0;
        for (Product p : inventory)
        {
            if (p.getName().equals(name))
            {
                quantity++;
                totalCost = totalCost + p.getCost();
            }
        }
        System.out.println(name + ": Quantity = " + quantity + ", Total cost = " + totalCost);
    }
    
    public static void compare(Tool a, Tool b)
    {
        int t = a.compareTo(b);
        if (t == 0)
            System.out.println(a.getName() + " 1 and " + a.getName() + " 2 are the samr price");
        else if (t == 1)
            System.out.println("The first " + a.getName() + " is more expensive");
        else
            System.out.println("The second " + a.getName() + " is more expensive");
    }
}
