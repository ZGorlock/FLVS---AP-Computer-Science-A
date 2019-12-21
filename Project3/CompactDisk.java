public class CompactDisk extends Disk
{
    public CompactDisk (String title, String artist, String sku)
    {
        super(title, artist, sku);
    }
    
    public String getMediaType()
    {
        return "CD";
    }
}