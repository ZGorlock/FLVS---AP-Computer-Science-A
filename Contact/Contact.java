/**
 * Creates Contact objects
 * 
 * @author Zachary Gill
 * @version 04-26-2013
 */
public class Contact
{
    private String name;
    private String relation;
    private String bday;
    private String phone;
    private String email;

    /**
     * Constructor for objects of class Contact
     */
    public Contact(String n, String r, String b, String p, String e)
    {
        name = n;
        relation = r;
        bday = b;
        phone = p;
        email = e;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRelation()
    {
        return relation;
    }
    
    public String getBday()
    {
        return bday;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public String getEmail()
    {
        return email;
    }

    /**
     * An overritten toString() method
     * 
     * @return <name> <relation> <bday> <phone> <email>
     */
    public String toString()
    {
        return String.format("%-18s%-18s%-18s%-18s%-18s", name, relation, bday, phone, email);
    }
}
